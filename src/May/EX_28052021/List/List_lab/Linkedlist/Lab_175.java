package May.EX_28052021.List.List_lab.Linkedlist;

import java.util.*;

public class Lab_175 {
    public static void main(String[] args) {
        List courselist = new LinkedList();
        courselist.add("JAVA");
        courselist.add("Python");
        courselist.add("AI");
        courselist.add("Machine learining");

        Vector vec = new Vector<>();
        vec.add("Python");
        vec.add("AI");
        //how to print - enum
        Enumeration eenum = vec.elements();
        while (eenum.hasMoreElements()){
            System.out.println(eenum.nextElement());
        }
    }
}
