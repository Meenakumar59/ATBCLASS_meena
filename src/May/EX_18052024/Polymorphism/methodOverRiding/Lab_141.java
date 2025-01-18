package May.EX_18052024.Polymorphism.methodOverRiding;

public class Lab_141 {
    public static void main(String[] args) {
      Dog d = new Hound();// Dynamic dispatch - when runtime only object be created then
        //it knows which method  shuld call - run time polymorphism
      d.bark();
    }
}
