package May.EX_18052024;


public class Lab_134 {
    public static void main(String[] args) {
       student1 sc1 = new student1();
//       person1 p1 = new person1();
//      If child has DC --> Parent Class DC can be called by
//      super constructor super() automatically i java

//        super key word call in different way
//        super.variable
//        super().method
//        super(); -DC
//        super("meena"); - PC
    }

}
class student1 extends person1{
     student1(){
         super("meena",100);
//         super("meena");
//         this("meena"); - we cant call at same time this and super and also cant
//         twice super in the constructor.
//         but can in super variable
        System.out.println("student1 - DC");//Same class name is def constructor

    }
}
class person1{
    person1(){
        super();
        System.out.println("person1 - DC");// sae class name is def constructor
    }
    person1(String a){
        System.out.println("person1 - PC");
    }
    person1(String a,int b){
        System.out.println("person1 - PC");
    }
}
