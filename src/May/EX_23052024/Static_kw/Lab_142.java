package May.EX_23052024.Static_kw;

public class Lab_142 {
    public static void main(String[] args) {
        Person p1 = new Person("meena");
        Person p2 = new Person("Anu");
        System.out.println(Person.footballclub);

        //static fn - call by class
        Person.m1();

        //Non - static fn - call by reference
        p1.m2();
        p2.m2();
        //can we access sattic fn with reference? Yes
        p1.m1();
        //can we call N-S fn by using class name ? - No
        //NS fn should be access by obj reference
       // Person.m2();

        Person c = null;
        c.m1();//ref is pointing to null though class is loaded , static also loaded
        //after thst object will be loaed
        c.m2();//instance can't be accessed

//can we chnage the value? yes
        Person.footballclub = "FB";
        System.out.println(p1.footballclub);//static so p1 and p2 has contains same name
        System.out.println(p2.footballclub);
        System.out.println(Person.footballclub);

        p1.name = "name";
        System.out.println(p1.name);
        System.out.println(p2.name);



    }
}
class Person{
    {
        System.out.println("IIB");
    }
    //static fun
    static void m1(){
        System.out.println("I am common to all fn");
    }
    //non - static fun
    void m2(){
        System.out.println("I am N-S fn");
    }
    String name;
    static String footballclub = "FC Clubb";

    public Person(String name) {
        this.name = name;
        System.out.println("your name -->" + this.name);
    }
    void printdetails(){
        System.out.println("your name -->" + this.name);
    }
}
