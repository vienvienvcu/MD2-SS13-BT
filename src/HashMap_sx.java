import java.util.HashMap;
import java.util.Map;

public class HashMap_sx {
    public static void main(String[] args) {
//        tao hashMap
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("one",1);
        hashMap.put("two",2);
        hashMap.put("three",3);
        hashMap.put("four",4);

//        duyet qua cac phan tu trong hashMap bang cach su dung Map.Entry

        for (Map.Entry<String,Integer> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+":"+value);
        }
    }

}
