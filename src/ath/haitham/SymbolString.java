package ath.haitham;

/**
 * Created by Haitham on 2016-11-13.
 */
public class SymbolString extends Symbol {
    private String svalue;

    SymbolString(String name,String type,String value) {
        super(name,type);
        svalue = value;
    }

    public String getSvalue() {
        return svalue;
    }

    public void setSvalue(String svalue) {
        this.svalue = svalue;
    }
}
