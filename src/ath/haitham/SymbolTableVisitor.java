package ath.haitham;

import java.util.*;

public class SymbolTableVisitor extends MicroBaseVisitor<String> {

    private Map<String,Scope> scopes = new LinkedHashMap<>();
    private Scope currentScope;
    private int block_no = 0;

    private static Stack<Scope> tmpScopes = new Stack<>();
    private static ArrayList<String> ids_list = new ArrayList<>();


    public void printScopes() {
        for (String scopeKey : getScopeKeys()) {
            System.out.println("<< " + scopeKey + " >>");
            getScope(scopeKey).printSymbols();
            System.out.println();
        }
    }

    public Scope getScope(String key) {
        return scopes.get(key);
    }

    public String[] getScopeKeys() {
        String[] scopeNames = new String[scopes.entrySet().size()];
        int i =0;
        for (String scope_name :
                scopes.keySet()) {
            scopeNames[i] = scope_name;
            i++;
        }
        return scopeNames;
    }

    @Override
    public String visitProgram(MicroParser.ProgramContext ctx) {
        openScope("Scope Global", null);
        visitChildren(ctx);
        closeScope();
        return null;
    }

    @Override
    public String visitString_decl(MicroParser.String_declContext ctx) {
        String name = ctx.id().getText();
        String value = ctx.str().getText();
        currentScope.addSymbol(name, "STRING", value);
        return visitChildren(ctx);
    }

    @Override
    public String visitVar_decl(MicroParser.Var_declContext ctx) {
        String type = ctx.var_type().getText();
        ids_list.clear();
        visit(ctx.id_list());
        for (String id_name:
             ids_list) {
            currentScope.addSymbol(id_name,type);
        }

        return super.visitVar_decl(ctx);
    }

    @Override
    public String visitId_list(MicroParser.Id_listContext ctx) {
        ids_list.add(ctx.id().getText());
        return visit(ctx.id_tail());
    }

    @Override
    public String visitExistId_tail(MicroParser.ExistId_tailContext ctx) {
        ids_list.add(ctx.id().getText());
        return visit(ctx.id_tail());
    }

    @Override
    public String visitId(MicroParser.IdContext ctx) {
        return ctx.var_name.getText();
    }

    @Override
    public String visitStr(MicroParser.StrContext ctx) {
        return ctx.str_val.getText();
    }

    @Override
    public String visitParam_decl(MicroParser.Param_declContext ctx) {
        String name = ctx.id().getText();
        String vartype = ctx.var_type().getText();
        currentScope.addSymbol(name,vartype);
        return visitChildren(ctx);
    }

    @Override
    public String visitFunc_decl(MicroParser.Func_declContext ctx) {
        String fname = ctx.id().getText();
        openScope("Scope " + fname, currentScope);
        visitChildren(ctx);
        closeScope();
        return null;
    }

    @Override
    public String visitIf_stmt(MicroParser.If_stmtContext ctx) {
        openScope(null, currentScope);
        visitChildren(ctx);
        closeScope();
        return null;
    }

    @Override
    public String visitExistElse(MicroParser.ExistElseContext ctx) {
        openScope(null, currentScope);
        visitChildren(ctx);
        closeScope();
        return null;
    }

    @Override
    public String visitParam_decl_tail(MicroParser.Param_decl_tailContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitFor_stmt(MicroParser.For_stmtContext ctx) {
        openScope(null, currentScope);
        visitChildren(ctx);
        closeScope();
        return null;
    }

    private void openScope(String sName, Scope previous) {
        if (previous != null) {
            tmpScopes.push(previous);
        }
        if(sName == null) {
            sName = "Scope BLOCK #" + ++block_no;
        }
        Scope s = new Scope();
        currentScope = s;
        scopes.put (sName,s);
    }

    private void closeScope() {
        if(!tmpScopes.empty())
            currentScope = tmpScopes.pop();
        else
            currentScope = null;
    }

    public String findSymbolType(String id) {
        String[] scopes = getScopeKeys();
        for (String skey :
                scopes) {
            SymbolTable cur = getScope(skey).getStable();
            Symbol sym = cur.getSymbol(id);
            if(sym != null)
                return sym.getVtype();
        }
        return null;
    }
}
