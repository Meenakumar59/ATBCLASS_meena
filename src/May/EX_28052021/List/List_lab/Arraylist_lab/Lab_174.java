package May.EX_28052021.List.List_lab.Arraylist_lab;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lab_174 {
    public static void main(String[] args) {
        List num = new ArrayList();//not mention data type which means object
        num.add(100);
        num.add(200);
        num.add(2000);
        num.add(2300);
        ListIterator itr = num.listIterator();//returns true if the iteration has more elements.
        while (itr.hasNext()){
            System.out.println(itr.next());
            itr.add(1000);
            //Removes from the underlying collection
            // the last element returned by this iterator
        }
        System.out.println("modified list :" + num);
//---------------------------------------------------------------
        //listiterator avilable in List - it has two function
        //1.Next - from left to right
        //2.previous - from right to left
        ListIterator lit = num.listIterator(num.size());
        while(lit.hasPrevious()){
            //while iteration you cannot add new element
            System.out.println(lit.previous());
            lit.add("Meena");
        }
        System.out.println("modified list :" + num);
    }
}
