package May.EX_18052024;

public class Lab_135 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog("bull dog");
        d2.display();
       Dog d3 = new Dog("dog TT", "Lambrodar");
        d3.display();
        Dog d4 = new Dog("dog AA", "German shephard",10);
        d4.display();


    }
}
class Animal{
    int a ;
    String type;
    Animal(){
        System.out.println("Animal DC");
    }
    public Animal(String type) {
        this.type = type;
        System.out.println("Animal PC");
    }



}
class Dog extends Animal{
    String breed;
    Dog(){
        System.out.println("Dog DC");
    }

    public Dog(String breed) {
        super("Dog type ");
        this.breed = breed;
    }

    public Dog(String breed, String type) {
      this(breed);
        this.breed = breed;
        System.out.println(" PC with two arg:");
    }
    public Dog(String type, String breed, int a) {

        super(type);
        this.breed = breed;
        this.a = a;
        System.out.println(" PC with three arg:");
    }



    void display(){
        System.out.println("type: " + super.type  + "-->" + "breed:  " + this.breed);
    }
}
