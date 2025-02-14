//package
package com.mapinterface.invertamap;

//import
import java.util.*;

//class
public class MapInverter {

    //method
    public static <K, V> Map<V, List<K>> invertMap(Map<K, V> inputMap) {
        Map<V, List<K>> invertedMap = new HashMap<>();

        for (Map.Entry<K, V> entry : inputMap.entrySet()) {
            V value = entry.getValue();
            K key = entry.getKey();

            // If the value already exists, append to the list
            invertedMap.computeIfAbsent(value, k -> new ArrayList<>()).add(key);
        }

        //return
        return invertedMap;
    }
}
