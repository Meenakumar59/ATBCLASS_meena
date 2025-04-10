package Practise_queson;

public class palindrome_2 {
    public static void main(String[] args) {
        String orgstr = "Malayalam";
        System.out.println("enter original string: " + orgstr);
        String finstr = "";
        for(int i = orgstr.length()-1; i>=0;i--){
            //9-1 = 8, 0

            finstr += orgstr.charAt(i);


        }
        System.out.println("reversed string: " + finstr);
    }
}
