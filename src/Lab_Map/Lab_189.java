package Lab_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Lab_189 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("first name","Meena");
        map.put("mid name", "meenu");
        map.put("last name","Kumar");
        map.put("mail","meenakumar5999@.com");

        Map<String, String> map2 = new HashMap<>();
        map2.put("first name","Meena");
        map2.put("mid name", "meenu");
        map2.put("last name","Kumar");
        map2.put("mail","meenakumar5999@.com");

        ArrayList list = new ArrayList<>();
        list.add(map);
        list.add(map2);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(1));

    }
}
