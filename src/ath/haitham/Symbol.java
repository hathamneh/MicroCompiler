package ath.haitham;

/**
 * Created by Haitham on 2016-11-13.
 */
public class Symbol {
    private String vname;
    private String vtype;

    Symbol(String name, String type) {
        vname=name;
        vtype=type;
    }

    public String getVname() {
        return vname;
    }

    public String getVtype() {
        return vtype;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public void setVtype(String vtype) {
        this.vtype = vtype;
    }
}
