package May.EX_28052021.List.List_lab.Linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab_176 {
    public static void main(String[] args) {
        List marks = new ArrayList();
        marks.add(100);
        marks.add(70);
        marks.add(80);
        marks.add(99);
        Collections.sort(marks);
        System.out.println(marks);
    }

}
