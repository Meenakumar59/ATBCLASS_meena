package Practise_queson;

public class Reverse {
    public static void main(String[] args) {
        String org = "Malayalam";
        String emp = "" ;
        char ch ;
        for(int i = 0; i<org.length();i++){
            ch = org.charAt(i);//extract each character
            emp =ch+emp;



        }
        System.out.println("print reverse word : " + emp);
    }
}
