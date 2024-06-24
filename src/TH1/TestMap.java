package TH1;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map <String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("John", 40);
        hashMap.put("Bob", 29);
        hashMap.put("Jack", 29);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");
        Map<String,Integer> treeMap = new TreeMap<>();
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap + "\n");
        Map<String,Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("John", 40);
        linkedHashMap.put("Bob", 29);
        linkedHashMap.put("Jack", 29);
        System.out.println("\nThe age for " + " Smith is " + linkedHashMap.get("Smith"));
    }
}
