package Assignments;

import java.util.Scanner;

public class palindrome1 {
    public static void main(String[] args) {
//        palindrome
//         reverse string - but will be same
//        eg: naman - naman
//        malayalam - malayalam
//        mom , madam,
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string, I will tell you if it is palindrome or not ");
        String user_input = sc.next();

        StringBuilder sb = new StringBuilder(user_input);
        String rev_input = sb.reverse().toString();
        if(user_input.equalsIgnoreCase(rev_input)){
            System.out.println(" it is palindrome " + rev_input);
        }else{
            System.out.println("Nope!!!!");
        }
    }
}

