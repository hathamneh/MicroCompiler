package ath.haitham;

/**
 * Created by haitham on 06/12/16.
 */
public class IRVisitor extends MicroBaseVisitor<String> {

    private static final byte INT = 1;
    private static final byte FLOAT = 2;
    private static final byte STR = 3;

    private SymbolTableVisitor st;

    IR_code theCode = new IR_code();

    private IR_stmt current_stmt = new IR_stmt();
    private byte opType;
    private byte numType;
    private int regs = 0;


    IRVisitor(SymbolTableVisitor st) {
        this.st = st;
    }

    @Override
    public String visitPrimaryInt(MicroParser.PrimaryIntContext ctx) {
        opType = Operand.INTOP;
        numType = INT;
        return ctx.operand.getText();
    }

    @Override
    public String visitPrimaryFloat(MicroParser.PrimaryFloatContext ctx) {
        opType = Operand.INTOP;
        numType = FLOAT;
        return ctx.operand.getText();
    }

    @Override
    public String visitPrimaryId(MicroParser.PrimaryIdContext ctx) {
        opType = Operand.MEMOP;
        numType = getNumType(st.findSymbolType(ctx.operand.getText()));
        return ctx.operand.getText();
    }

    @Override
    public String visitPrimaryExpr(MicroParser.PrimaryExprContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public String visitMulop(MicroParser.MulopContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitAddop(MicroParser.AddopContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitExpr(MicroParser.ExprContext ctx) {
        String eprefix = visit(ctx.expr_prefix());
        String term = visit(ctx.term());

        if (eprefix == null) {
            return term;
        }
        if (eprefix.split("\t").length > 1)
            current_stmt = new IR_stmt(eprefix);
        if(opType == Operand.MEMOP) {
            numType = getNumType(st.findSymbolType(term));
            current_stmt.setType(numType);
        }
        current_stmt.addOperand(new Operand(term, opType));
        Register res = new Register();
        current_stmt.setRes(res);
        opType = Operand.REGOP;
        //current_stmt.print();
        theCode.emit(current_stmt);
        return res.toString();
    }

    @Override
    public String visitTerm(MicroParser.TermContext ctx) {

        String fprefix = visit(ctx.factor_prefix());
        String factor = visit(ctx.factor());

        if (fprefix == null) {
            current_stmt = new IR_stmt();
            current_stmt.addOperand(new Operand(factor, opType));
            return factor;
        }

        //System.out.println(fprefix);
        current_stmt = new IR_stmt(fprefix);
        if(opType == Operand.MEMOP) {
            numType = getNumType(st.findSymbolType(factor));
            current_stmt.setType(numType);
        }
        current_stmt.addOperand(new Operand(factor, opType));

        Register res = new Register();
        current_stmt.setRes(res);
        opType = Operand.REGOP;
        //current_stmt.print();
        theCode.emit(current_stmt);
        return res.toString();
    }

    @Override
    public String visitNoFPrefix(MicroParser.NoFPrefixContext ctx) {
        return null;
    }

    @Override
    public String visitFPrefix(MicroParser.FPrefixContext ctx) {

        String fprefix = visit(ctx.factor_prefix());
        String factor = visit(ctx.factor());

        if (fprefix == null) {
            Opcode o = new Opcode(visit(ctx.mulop()),numType);
            current_stmt = new IR_stmt(o);
            current_stmt.addOperand(new Operand(factor, opType));
            return current_stmt.toString();
        }

        if(opType == Operand.MEMOP) {
            numType = getNumType(st.findSymbolType(factor));
            current_stmt.setType(numType);
        }
        current_stmt.addOperand(new Operand(factor, opType));
        Register res = new Register();
        current_stmt.setRes(res);
        theCode.emit(current_stmt);

        Opcode o = new Opcode(visit(ctx.mulop()),numType);
        current_stmt = new IR_stmt(o, new Operand(res.toString(), Operand.REGOP));
        return current_stmt.toString();

    }

    @Override
    public String visitEmptyExprPrefix(MicroParser.EmptyExprPrefixContext ctx) {
        return null;
    }

    @Override
    public String visitExprPrefix(MicroParser.ExprPrefixContext ctx) {
        String exprPrefix = visit(ctx.expr_prefix());
        String term = visit(ctx.term());

        if (exprPrefix == null) {
            Opcode o = new Opcode(visit(ctx.addop()),numType);
            current_stmt = new IR_stmt(o);
            current_stmt.addOperand(new Operand(term, opType));
            return current_stmt.toString();
        }

        //System.out.println(exprPrefix);
        if (exprPrefix.split("\t").length > 1)
            current_stmt = new IR_stmt(exprPrefix);
        if(opType == Operand.MEMOP) {
            numType = getNumType(st.findSymbolType(term));
            current_stmt.setType(numType);
        }
        //current_stmt.print();
        current_stmt.addOperand(new Operand(term, opType));
        Register res = new Register();
        opType = Operand.REGOP;
        current_stmt.setRes(res);
        theCode.emit(current_stmt);
        Opcode o = new Opcode(visit(ctx.addop()),numType);
        current_stmt = new IR_stmt(o, new Operand(res.toString(), Operand.REGOP));
        return current_stmt.toString();
    }

    @Override
    public String visitAssign_expr(MicroParser.Assign_exprContext ctx) {
        String id = ctx.id().getText();
        String value = visit(ctx.expr());

        Operand[] operands = {new Operand(value), new Operand(id)};
        Opcode o = new Opcode("store",numType);
        theCode.emit(new IR_stmt(o, operands));

        return value;
    }

    @Override
    public String visitWrite_stmt(MicroParser.Write_stmtContext ctx) {

        String ids = ctx.id_list().getText();
        for (String id :
                ids.split(",")) {
            Opcode o = new Opcode("write",getNumType(st.findSymbolType(id)));
            theCode.emit(new IR_stmt(o, new Operand(id, Operand.MEMOP)));
        }
        return null;
    }

    @Override
    public String visitRead_stmt(MicroParser.Read_stmtContext ctx) {
        String ids = ctx.id_list().getText();
        for (String id :
                ids.split(",")) {
            Opcode o = new Opcode("read",getNumType(st.findSymbolType(id)));
            theCode.emit(new IR_stmt(o, new Operand(id, Operand.MEMOP)));
        }
        return null;
    }

    @Override
    public String visitFunc_decl(MicroParser.Func_declContext ctx) {
        String id = ctx.id().getText();
        Label label = new Label(id);
        IR_stmt stmt = new IR_stmt(label);
        theCode.emit(stmt);
        visit(ctx.func_body());
        return null;
    }

    @Override
    public String visitFor_stmt(MicroParser.For_stmtContext ctx) {
        visit(ctx.init_expr());
        Label label = new Label();
        theCode.emit(new IR_stmt(label));
        Label label2 = new Label(visit(ctx.cond()));
        Opcode o = new Opcode("JUMP");

        visit(ctx.decl());
        visit(ctx.stmt_list());
        visit(ctx.incr_expr());
        theCode.emit(new IR_stmt( o, new Operand(label) ));
        theCode.emit(new IR_stmt(label2));
        return null;
    }

    @Override
    public String visitIf_stmt(MicroParser.If_stmtContext ctx) {
        String labelNum = visit(ctx.cond());
        Label label = new Label(labelNum);
        visit(ctx.decl());
        visit(ctx.stmt_list());
        if(visit(ctx.else_part()) == null)
            theCode.emit(new IR_stmt(label));
        return null;
    }

    @Override
    public String visitExistElse(MicroParser.ExistElseContext ctx) {
        Label label2 = new Label();
        Label label = new Label();
        Opcode o = new Opcode("JUMP");
        theCode.emit(new IR_stmt(o,new Operand(label.toString(),Operand.LABNAM)));
        theCode.emit(new IR_stmt(label2));
        visit(ctx.decl());
        visit(ctx.stmt_list());
        label = new Label();
        theCode.emit(new IR_stmt(label));
        return label.toString();
    }

    @Override
    public String visitNoElse(MicroParser.NoElseContext ctx) {
        return null;
    }

    @Override
    public String visitCond(MicroParser.CondContext ctx) {
        String opLeft = visit(ctx.expr(0));
        String operation = ctx.compare().getText();
        Opcode o = new Opcode(operation);
        String opRight = visit(ctx.expr(1));
        Operand[] operands = {new Operand(opLeft), new Operand(opRight)};
        Label label = new Label();
        IR_stmt stmt = new IR_stmt(o, operands, label.toString());
        theCode.emit(stmt);
        return label.toString();
    }

    private byte getNumType(String type) {
        switch (type) {
            case "INT":
                return INT;
            case "FLOAT":
                return FLOAT;
            case "STRING":
                return STR;
        }
        return 0;
    }
}
