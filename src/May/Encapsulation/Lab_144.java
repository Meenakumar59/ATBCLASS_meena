package May.Encapsulation;

public class Lab_144 {
    public static void main(String[] args) {
        ICICI i = new ICICI(100,"Meena");
        System.out.println(i.getBalance());
        i.setBalance(-100);
      //  i.name = "ICICI";//Cant set values without using set method
    }
}
