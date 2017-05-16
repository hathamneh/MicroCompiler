package ath.haitham;

/**
 * Created by haitham on 16/12/16.
 */
public class Opcode {
    private static final byte INT = 1;
    private static final byte FLOAT = 2;
    private static final byte STR = 3;

    private byte type;
    private String operation;

    Opcode(String operation) {
        this.operation = operation;
    }
    Opcode(String operation, byte type) {
        this.operation = operation;
        this.type = type;
    }
    Opcode(Opcode op) {
        this.operation = op.operation;
        this.type = op.getType();
    }
    Opcode(String operation, String type) {
        this.operation = operation;
        this.type = reverseType(type);
    }

    private String opcode() {
        switch (operation) {
            case "+":
                return "ADD";
            case "-":
                return "SUB";
            case "*":
                return "MULT";
            case "/":
                return "DIV";
            case "store":
                return "STORE";
            case "write":
                return "WRITE";
            case "read":
                return "READ";
            case "<":
                return "GE";
            case ">":
                return "LE";
            case ">=":
                return "LS";
            case "<=":
                return "GT";
            case "=":
                return "NE";
            case "!=":
                return "EQ";
            case "JUMP":
                return "JUMP";
            case "LABEL":
                return "LABEL";
            default:
                return operation;
        }
    }

    private String type() {
        switch (type) {
            case INT:
                return "I";
            case FLOAT:
                return "F";
            case STR:
                return "S";
        }
        return "";
    }

    private byte reverseType(String type) {
        switch (type) {
            case "I":
                return INT;
            case "F":
                return FLOAT;
            case "S":
                return STR;
        }
        return 0;
    }

    public String toString() {
        return opcode() + type();
    }

    public void setType(byte type) {
        this.type = type;

    }

    public byte getType() {
        return type;
    }
}
