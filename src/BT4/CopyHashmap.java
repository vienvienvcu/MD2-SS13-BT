package BT4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CopyHashmap {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("a", "b");
        hashMap.put("c", "d");
        hashMap.put("e", "f");
        hashMap.put("g", "h");

        System.out.println("Các phần tử có trong hashMap: ");
        Set<Map.Entry<String, String>> setHashMap = hashMap.entrySet();
        System.out.println(setHashMap);
//        tạo 1 HashMap rỗng
        HashMap<String, String> hashMapCopy = new HashMap<>();
//       phương thức size() sẽ trả về số lượng entry có trong hashMapCopy
        System.out.println("Số lượng các entry có trong hashMapCopy "
                + "trước khi sao chép = " + (hashMapCopy.size()));
        // sao chép các entry của hashMap
        // vào trong hashMapCopy
        hashMapCopy.putAll(hashMap);

        System.out.println("Số lượng các entry có trong hashMapCopy "
                + "sau khi sao chép = " + (hashMapCopy.size()));
        System.out.println("Các phần tử có trong hashMapCopy: ");
        Set<Map.Entry<String, String>> setHashMapCopy = hashMapCopy.entrySet();
        System.out.println(setHashMapCopy);
    }

}
