package June.EX_01062024.Lab_setss;

import java.util.HashSet;
import java.util.Set;

public class Lab_180 {
    public static void main(String[] args) {
        //set - interface
        //hashset - class
        //imp hashset - duplicate not allowed, order not maintain,case sensitive,
        //fast for search and retrieving elements
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("plum");
        fruits.add("Orange");
        fruits.add(null);
        System.out.println(fruits);
        System.out.println(fruits.size());
        System.out.println(fruits.isEmpty());
        System.out.println(fruits.contains("Orange"));
        System.out.println(fruits.remove("Apple"));
        System.out.println(fruits);
        fruits.clear();
        System.out.println(fruits);
    }
}
