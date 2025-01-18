package May.EX_28052021.List.List_lab;

import java.util.List;

public class Lab_167 {

//    shopping List
//            milk, bread , eggs
//    collection framework - how can you store elemtnts
//    List( interface)-->array,linked, stack, vector(classes)
public static void main(String[] args) {
    List shoping_list = List.of("milk","egg");
    System.out.println(shoping_list);
    System.out.println(shoping_list.size());

    List fruits = List.of("guva","apple","mango","mango");
    //list can have duplicates
    System.out.println(fruits);
    System.out.println(fruits.size());

    List diff_data_types = List.of("meena",5,true);
    //list have different data types
    System.out.println(fruits.get(2));
    System.out.println(fruits.indexOf("mango"));
    //always give first index
    System.out.println(fruits.isEmpty());

   // fruits.add("strawbwerry");//impossible to add
    fruits.remove("strawbwerry");//impossible to add
    //reason : static - class loading done one time after exectuion cant add
    System.out.println(fruits);
    //get, indexof,isempty,

}

}
