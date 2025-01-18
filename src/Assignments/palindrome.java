package Assignments;

public class palindrome {
    public static void main(String[] args) {
        String str = "Malayalam";
        System.out.println("orginal string----" + str);
        String reversed = "";
        for(int i = str.length()-1;i>=0;i--){
            reversed += str.charAt(i);

        }
        System.out.println("Reversed string----" + reversed);
    }
}

