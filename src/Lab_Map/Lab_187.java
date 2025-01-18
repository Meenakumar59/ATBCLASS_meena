package Lab_Map;

import java.util.HashMap;
import java.util.Map;

public class Lab_187 {
    public static void main(String[] args) {
        //Map - interface - key value pair
        //Api testing - json- javascript object notation - map
        //JSON - Key value pair
        //Hash set  and hash map
        // Map<String,String > students = new HashMap<>();
        //if string - int also changed as string
        // Map<String,Integer> students = new HashMap<>();
        Map<String, Object> students = new HashMap<>();
        students.put("First name", "meena");
        //students.put("First name","Meena");- duplicate not allowed
        students.put("age", 25);
        students.put("course", "ATB");
        students.put("lastname", "kumar");
        students.put("ismale", false);
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
