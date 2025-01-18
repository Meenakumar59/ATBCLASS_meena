package June.EX_01062024;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Lab_181 {
    public static void main(String[] args) {
        HashSet<String> fruits = new LinkedHashSet<>(10,5);
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("plum");
        fruits.add("Orange");
        System.out.println(fruits);
        System.out.println(fruits.size());
        System.out.println(fruits.isEmpty());
        System.out.println(fruits.contains("Orange"));
        System.out.println(fruits.remove("Apple"));
        System.out.println(fruits);
        fruits.clear();
        System.out.println(fruits);
        //everything is same
        //except does order maintain
    }
}
