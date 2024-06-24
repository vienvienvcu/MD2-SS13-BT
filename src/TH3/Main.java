package TH3;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("kien",30,"ht");
        Student student1 = new Student("ha",31,"hn");
        Student student2 = new Student("anh",38,"ht");
        Student student3 = new Student("tung",39,"hn");

        List<Student> lists = new ArrayList<Student>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for (Student s : lists) {
            System.out.println(s.toString());
        }
    }
}
