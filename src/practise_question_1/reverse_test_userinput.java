package practise_question_1;

import java.util.Scanner;

public class reverse_test_userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String input = sc.nextLine();
        String rev = "";
        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            rev=ch+rev;
        }
        System.out.println("original string:  " + input);
        System.out.println("reversed string :  " + rev);
    }
}
