package ath.haitham;

/**
 * Created by haitham on 16/12/16.
 */
public class Label {
    static int num;
    private String label;
    Label(){
        label = "L" + ++num;
    }

    Label(String l) {
        label = l;
    }

    @Override
    public String toString() {
        return label;
    }
}
