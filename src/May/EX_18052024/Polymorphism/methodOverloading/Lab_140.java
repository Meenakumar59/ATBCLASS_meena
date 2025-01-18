package May.EX_18052024.Polymorphism.methodOverloading;

public class Lab_140 {


    //method overloading - same method name with different argument
    void gift(String a){
        System.out.println("gift--> " + a);
    }
    void gift(int i){
        System.out.println("gift--> " + i);
    }

    void gift(float y){
        System.out.println("gift--> " + y);
    }

    void gift(double z){
        System.out.println("gift--> " + z);
    }

    public static void main(String[] args) {
        Lab_140 l = new Lab_140();
        l.gift("muruga");// compile time polymorphism - while compiling knows the which should match
        l.gift(1200F);
        l.gift(23.45);
    }
}


