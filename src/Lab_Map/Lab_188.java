package Lab_Map;

import java.util.*;

public class Lab_188 {
    public static void main(String[] args) {
      //  Map<String, Object> students = new TreeMap<>();
        Map<String, Object> students = new HashMap<>();
        //Map<String, Object> students = new WeakHashMap<>();
        //collect garbage , doesn't store memory after executing , remove memory - acts as a garbage collector
     //   Map<String, Object> students = new LinkedHashMap<>();
        //order maintain
        students.put("First name", "meena");
        //students.put("First name","Meena");- duplicate not allowed
        students.put("age", "twentyfive");
        students.put("course", "ATB");
        students.put("lastname", "kumar");
       // students.put("ismale", false);
        System.out.println(students);
        System.out.println(students.get("First name"));
        System.out.println(students.get("Course"));
        System.out.println(students.containsKey("lastname"));
        System.out.println(students.containsValue("Kumar"));//case sensitive
        System.out.println(students.keySet());//print all key
        System.out.println(students.values());//print all vaues
        for(Map.Entry<String,Object> item : students.entrySet()){
            System.out.println(item.getKey() + "  " + item.getValue());
        }
    }

    }

