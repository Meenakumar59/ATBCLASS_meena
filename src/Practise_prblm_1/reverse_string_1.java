package Practise_prblm_1;

public class reverse_string_1 {
    public static void main(String[] args) {
        String org = "Programming";
        String rev = "";
        for(int i=org.length()-1; i>=0;i--){
            rev = rev+org.charAt(i);
        }
        System.out.println(rev);
    }
}
