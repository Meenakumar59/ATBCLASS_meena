package May.EX_28052021.List.List_lab.Linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab_179 {
    public static void main(String[] args) {
        List marks = new ArrayList();
        marks.add(100);
        marks.add(70);
        marks.add(80);
        marks.add(99);
        Collections.sort(marks);
        System.out.println(marks);

        Student student = new Student("Meena",1);
        Student student2= new Student("Anandhi",7);
        Student student3 = new Student("Iniyan",5);
        List list = new ArrayList<>();
        list.add(student);
        list.add(student2);
        list.add(student3);
        System.out.println(list);
        Collections.sort(list, new sortByNameAsc());
        System.out.println(list);
    }
}
