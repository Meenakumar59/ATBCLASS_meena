package May.EX_11052024;

public class Person {
//    Class - blueprint
//    Attribute

    String name;
    int age;
    double height;
    boolean ismale;
    long phno;
    float salary;
    String eyecolour;

//    Behavior -- functinality
    void walk() { //no return type  and no parameter
        System.out.println("I will walk");
    }
    void talk(String msg) { // parameter with no return type
        System.out.println("will say" + msg);
    }
    String sleep(){
        return " sleeping";
    }
    String ear(String item){
        return item;
    }

}

