package June.EX_01062024.Lab_setss;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lab_182 {
    public static void main(String[] args) {
        Set course = new HashSet<>();
        course.add("Java");
        course.add("Devops");
        course.add("Pyhton");
        course.add("Typescript");
        for(Object obj:course){
            System.out.println(obj);
        }

        Iterator it = course.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
