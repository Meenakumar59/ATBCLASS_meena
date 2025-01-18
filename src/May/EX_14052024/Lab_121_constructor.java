package May.EX_14052024;

public class Lab_121_constructor {
    public Lab_121_constructor(String name, String coursename, long mblno, String mail) {
        this.name = name;
        this.coursename = coursename;
        this.mblno = mblno;
        this.mail = mail;
    }

    //  constructor - 2 types
//1. defaulter
//
    String name;//instance variable
    String coursename;
    long mblno;
    String mail;
//    Two types
//   1 Default constructor
//    Special method with no return type
//     1 called when you create an object of class
//    It has the same name of the class name

    Lab_121_constructor(String name, String coursename){
       this.coursename=coursename;
       this.name=name;
    }
    Lab_121_constructor(String name){
        this.name=name;
    }
//    Method overloading - same name and different arguments
// parameter constructor
    Lab_121_constructor(String gvname, long num){
        this.name = gvname;
        this.mblno = num;

    }
    Lab_121_constructor(){
        coursename = "SELENIUM";
        System.out.println("default constructor");
    }

    void Lab_121_constructor(){

    }
}
