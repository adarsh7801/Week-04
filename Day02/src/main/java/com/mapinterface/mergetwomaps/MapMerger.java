//package
package com.mapinterface.mergetwomaps;

//importing
import java.util.Map;
import java.util.HashMap;

//class
public class MapMerger {

    //method
    public static Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {

        // Copy first map
        Map<String, Integer> mergedMap = new HashMap<>(map1);

        //merging
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            mergedMap.put(entry.getKey(), mergedMap.getOrDefault(entry.getKey(), 0) + entry.getValue());
        }

        //returning
        return mergedMap;
    }
}
