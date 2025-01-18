package May.Ex_30052024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Lab_173 {
    public static void main(String[] args) {
        List<String> studentlist = new ArrayList<>();
        studentlist.add("Abitha");
        studentlist.add("Bhava");
        studentlist.add("iniyan");

        List num = new ArrayList();//not mention data type which means object
        num.add(100);
        num.add(200);
        num.add(2000);
        num.add(2300);

        studentlist.addAll(num);//addall function
        //add elements from other list(string) into existing list(object)
        System.out.println(studentlist);

//        Iterator available in all
//        it has navigate as cursor from left to right
        Iterator it = num.iterator();
        while(it.hasNext()){
            num.add("Meena");//while iteration you cannot add new element
            System.out.println(it.next());
        }
        System.out.println(num);




    }
}
