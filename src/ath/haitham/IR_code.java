package ath.haitham;

import java.util.LinkedList;

/**
 * Created by haitham on 07/12/16.
 */
public class IR_code {
    private LinkedList<IR_stmt> code;

    IR_code() {
        code = new LinkedList<>();
    }

    public void emit(IR_stmt stmt) {
        code.add(new IR_stmt(stmt));
    }

    void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        String out = "";
        for (IR_stmt aCode : code) {
            out += aCode.toString() + "\n";
        }
        return out;
    }
}
