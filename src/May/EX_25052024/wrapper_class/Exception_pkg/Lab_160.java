package May.EX_25052024.wrapper_class.Exception_pkg;

public class Lab_160 {
    public static void main(String[] args) {
    Bank ICICI = new Bank("INR",1000);
    Bank SBI = new Bank("INR",5000);
    Bank BNYMELLON = new Bank("USD",100);
    Integer tot = SBI.add(BNYMELLON);
        System.out.println(tot);
    }
}
