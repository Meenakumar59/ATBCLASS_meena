package Practise_queson;

import java.util.Scanner;

public class plaindrome_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a org string : ");
        String input = sc.nextLine();

        StringBuilder sb = new StringBuilder(input);
        String rev = sb.reverse().toString();
        if(input.equalsIgnoreCase(rev)){
            System.out.println("palindrome: " + rev);
        }else {
            System.out.println("not a palindrome");
        }
    }
}
