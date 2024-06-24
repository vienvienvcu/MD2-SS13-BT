package BT3;

import java.security.KeyStore;
import java.util.*;

public class SortHashmap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(44, "vien");
        map.put(45, "HAI");
        map.put(30, "HA");
        map.put(80, "NAM");
        map.put(19, "TUNG");

        List<Map.Entry<Integer, String>> list1 = new ArrayList<>(map.entrySet());

        Comparator<Map.Entry<Integer, String>> comparator = new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        };
    Collections.sort(list1, comparator);

    Map<Integer, String> SortedMap= new HashMap<>();
    for (Map.Entry<Integer, String> entry : list1) {
        SortedMap.put(entry.getKey(), entry.getValue());
    }
        System.out.println("Original map: " + map);
        System.out.println("Sorted map: " + SortedMap);
    }
}
