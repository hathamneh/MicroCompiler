package ath.haitham;

/**
 * Created by haitham on 16/12/16.
 */
public class Register {
    static int num;
    private String name;

    Register() {
        this.name = "$T" + (++num);
    }

    @Override
    public String toString() {
        return name;
    }
}
