package BT5;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortTreemap {
    public static void main(String[] args) {

        SortedMap<String ,String> sortedMap = new TreeMap<>();
        sortedMap.put("E","e");
        sortedMap.put("B","b");
        sortedMap.put("A","a");
        sortedMap.put("D","d");
        sortedMap.put("F","f");
        sortedMap.put("C","c");
        System.out.println("Các entry có trong sortedMap là: ");
        sortedMap.forEach((keyChar, valueInt) -> System.out.println(
                "Key = " + keyChar + ", value = " + valueInt));
    }
}
