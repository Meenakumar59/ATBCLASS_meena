package May.EX_28052021.List.List_lab.Arraylist_lab;

import java.util.ArrayList;
import java.util.List;

public class Lab_168 {
    public static void main(String[] args) {
        //List l = new List();
        //List is an interface - can ypu create object of interface? No
        List list = new ArrayList();//dynamic dispatch - polymorpghism
        //can you create an object of class array list ? yes
        ArrayList list1 = new ArrayList();
        //add,remove,contain,isempty,idexof,get
        //addall,remobeall,containall,retainall
        list.add("mmena");
        list.add("ena");
        list.add("amma");
        list.add("amma");//duplicate
        list.add("apsaa");
        list.add("iniyan");
        System.out.println(list);
        System.out.println(list.size());
        list.clear();
        System.out.println(list);
        System.out.println(list.isEmpty());//checks empty or not
        list.add("meena");
        list.add("anu");
        list.add("thugil");//new elemt is added , at the end be added
        System.out.println(list);

        list.set(1,"kumar");//set is used to where we wwant to add it
        list.add("amma");
        System.out.println(list);

        System.out.println("-----------------");

        //how to print?
        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        //for each
        for (Object obj:list){//String not applicable if add diff data types
            System.out.println(obj);
        }
    }
}
