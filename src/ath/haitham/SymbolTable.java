package ath.haitham;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Haitham on 2016-11-13.
 */
public class SymbolTable {
    private Map<String, Symbol> stable;

    SymbolTable() {
        stable = new LinkedHashMap<>();
    }

    public void add(Symbol s) {
        stable.put(s.getVname(),s);
    }

    public Map<String, Symbol> getStable() {
        return stable;
    }

    public Symbol getSymbol(String id) {
        return stable.get(id);
    }
//    public boolean hasSymbol(Symbol s) {
//
//    }
}
