package ath.haitham;

import java.util.Map;
import java.util.Objects;

/**
 * Created by Haitham on 2016-11-13.
 */
public class Scope {
    private SymbolTable st;
    private boolean open = false;

    Scope() {
        st = new SymbolTable();
        open = true;
    }

    public void addSymbol(String name, String type) {
        Symbol s = new Symbol(name, type);
        st.add(s);
    }

    public void addSymbol(String name, String type, String value) {
        SymbolString s = new SymbolString(name,type,value);
        st.add(s);
    }

    public SymbolTable getStable() {
        return st;
    }

    public void printSymbols() {
        for (Map.Entry<String, Symbol> entry : getStable().getStable().entrySet()) {
            Symbol s = entry.getValue();
            System.out.print("name: " + s.getVname() + " , type: " + s.getVtype());
            if(s.getVtype().equals("STRING"))
                System.out.print(" , value: "+ ((SymbolString) s).getSvalue());
            System.out.println();
        }
    }



}
