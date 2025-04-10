package Practise_queson;

public class remove_nondigitnumeric {
    public static void main(String[] args) {
        String s = "12345@fgg2324dgdbdf";
        String nondigit = s.replaceAll("\\D","");
        System.out.println(nondigit);

    }
}
