package ath.haitham;

/**
 * Created by haitham on 15/12/16.
 */
public class Operand {

    static final byte INTOP = 0;
    static final byte REGOP = 1;
    static final byte MEMOP = 2;
    static final byte LABNAM = 3;

    String text;
    byte type;

    Operand(String text){
        this.text = text;
        if(text != null)
            this.type = getType(text);
    }

    Operand(String text, byte type){
        this.text = text;
        this.type = type;
    }

    Operand(Label label) {
        this.text = label.toString();
        this.type = LABNAM;
    }


    private boolean isInteger(String str) {
        int size = str.length();

        for (int i = 0; i < size; i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }

        return size > 0;
    }

    private boolean isReg(String str) {
        return str.charAt(0) == '$';
    }

    private byte getType(String str) {
        return (isInteger(str) ? INTOP : isReg(str) ? REGOP : MEMOP);
    }
}
