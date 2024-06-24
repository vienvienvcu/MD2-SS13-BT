package BT1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserHashMap {
    public static void main(String[] args) {
        System.out.println("nhap so phan tu cua mang");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
//        khoi tao arr
        int [] array = new int[n];
        System.out.println("nhap cac  phan tu cua mang");
        for (int i = 0; i < n; i++) {
            System.out.println("array["+i+"] = " + i);
            array[i] = scanner.nextInt();
        }
//        tim so lan xuat hien cua cac phan tu
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            addElement(map,array[i]);
        }
        System.out.println("Các phần tử xuất hiện: ");
        for (Integer key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }

    }
    public static void addElement(Map<Integer, Integer> map, int value) {
        if (map.containsKey(value)) {
            int count = map.get(value) + 1;
            map.put(value, count + 1);
        }else {
            map.put(value, 1);
        }
    }
}
