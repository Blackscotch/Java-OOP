package hw2;

import java.util.HashMap;
import java.util.Map;

public final class Mutable {
    private final String fild;
    private final Map<Integer, String> fildMap;

    public Mutable(String fild, Map<Integer, String> fildMap) {
        this.fild = fild;
        Map<Integer, String> copy = new HashMap<Integer, String>();
        for (Integer key : fildMap.keySet()){
            copy.put(key, fildMap.get(key));
        }
        this.fildMap = copy;
    }

    public String getFild() {
        return fild;
    }

    public Map<Integer, String> getFildMap() {
        Map<Integer, String> copy = new HashMap<Integer, String>();
        for (Integer key : fildMap.keySet()){
            copy.put(key, fildMap.get(key));
        }
        return copy;
    }
}
