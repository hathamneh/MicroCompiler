package ath.haitham;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by haitham on 07/12/16.
 */
public class IR_stmt {

    private Opcode opcode;
    private String res;

    private Operand[] operands = new Operand[2];

    IR_stmt() {

    }

    IR_stmt(IR_stmt stmt) {
        this.opcode = stmt.opcode;
        this.operands = stmt.getOperands();
        this.res = stmt.getRes();
    }
    IR_stmt(Label label) {
        this.opcode = new Opcode("LABEL");
        this.addOperand(new Operand(label.toString(),Operand.LABNAM));
    }

    IR_stmt(String stmt) {
        String[] stmts = stmt.split("\t");
        if (!stmts[0].equals("null")) {
            this.opcode = new Opcode(stmts[0].substring(0, stmts[0].length() - 1), stmts[0].substring(stmts[0].length() - 1));
        }
        if (!stmts[1].equals("null")) {
            this.addOperand(new Operand(stmts[1]));
        }
        if (!stmts[2].equals("null")) {
            this.addOperand(new Operand(stmts[2]));
        }

        if (!stmts[3].equals("null"))
            this.res = stmts[3];
    }

    IR_stmt(Opcode op) {
        this.opcode = new Opcode(op);
    }
    IR_stmt(Opcode opcode, Operand operand) {
        this.opcode = new Opcode(opcode);
        addOperand(new Operand(operand.text, operand.type));
    }

    IR_stmt(Opcode opcode, Operand[] operands) {
        this.opcode = new Opcode(opcode);
        this.operands = operands;
    }

    IR_stmt(Opcode opcode, Operand[] operands, String res) {
        this.opcode = new Opcode(opcode);
        this.operands = operands;
        this.res = res;
    }


    public byte getType() {
        return opcode.getType();
    }

    public void setOpcode(Opcode opcode) {
        this.opcode = new Opcode(opcode);
    }

    public void setType(byte type) {
        opcode.setType(type);
    }

    public boolean addOperand(Operand op) {
        if (operands[0] == null) {
            operands[0] = new Operand(op.text, op.type);
            return true;
        } else if (operands[1] == null) {
            operands[1] = new Operand(op.text, op.type);
            return true;
        }
        return false;
    }

    public Operand[] getOperands() {
        return operands;
    }

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }
    public void setRes(Register res) {
        this.res = res.toString();
    }


    public void print() {
        System.out.println(toString());
    }

    public String toString() {
        String st = opcode.toString();
        if (operands[0] != null) st += "\t" + operands[0].text;
        else st += "\tnull";
        if (hasOp2()) {
            if (operands[1] != null) st += "\t" + operands[1].text;
            else st += "\tnull";
        }
        if (hasRes())
            st += "\t" + res;

        return st;
    }

    private boolean hasRes() {
        Set<String> words = new HashSet<>();
        words.add("ADD");
        words.add("SUB");
        words.add("MUL");
        words.add("DIV");
        words.add("LE");
        words.add("GE");
        words.add("GT");
        words.add("LS");
        words.add("EQ");
        words.add("NE");

        for (String word : words) {
            if (opcode.toString().contains(word)) {
                return true;
            }
        }
        return false;
    }

    private boolean hasOp2() {
        Set<String> words = new HashSet<String>();
        words.add("READ");
        words.add("WRITE");
        words.add("LABEL");
        words.add("JUMP");

        for (String word : words) {
            if (opcode.toString().contains(word)) {
                return false;
            }
        }
        return true;
    }
}
