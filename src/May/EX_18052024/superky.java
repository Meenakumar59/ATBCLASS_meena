package May.EX_18052024;

public class superky {
//    today class topic
//     super key word
//       * use of super with variables
//       *use of super with methods
//       *use of super with constructor
//     Constructor chaining
//     Encapsulation
//     Polymorphism
//     Abstraction
//     Access modifiers
//    Static keyword
//    Inner class - rarely used

    //    Super keyword
    // parent - child
//    Super is reference to a parent class
////    Reference means - variable of parent
//     - variable of method
    public static void main(String[] args) {
        car c = new car();
//       int speed = c.maxspeed;
//        System.out.println(speed); -
//       u can acces instance varable in runner class but if u want access inside the method u
//       can call method
//       for eg: made private for instance variable - then u wont access but can access inside the method
        c.display();

    }

}

     class car extends vechicle {
        private int maxspeed = 50;

        void display() {
            System.out.println("max of car speed can be" + this.maxspeed);//I can accessing my speed using this
            System.out.println("max of vechicle speed can be" + super.maxspeed);//I can accessing my parent's car speed using super
        }
    }

    class vechicle {
        int maxspeed = 100;//instance varibale

        void message() {
            System.out.println("this is vechicle class");
        }

    }
