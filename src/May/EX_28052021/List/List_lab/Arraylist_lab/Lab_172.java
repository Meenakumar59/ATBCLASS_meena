package May.EX_28052021.List.List_lab.Arraylist_lab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Lab_172 {
    public static void main(String[] args) {
        Vector mylist = new Vector();
        mylist.add("meena");
        mylist.add("Teena");
        mylist.add("Neena");
        mylist.remove("meena");

        System.out.println(" print 1 ");
//        for(Object obj:mylist){
//            System.out.println(obj);
//        }
//        System.out.println(" print 2 ");
//        for(int i =0 ; i<mylist.size();i++){
//            System.out.println(mylist.get(i));
//        }
        System.out.println(" print 3 ");

        Iterator<String> itr = mylist.iterator();//returns true if the iteration has more elements.
        while (itr.hasNext()){//Returns the next element in the iteration
            System.out.println(itr.next());//Removes from the underlying collection
            // the last element returned by this iterator
        }
    }
}
