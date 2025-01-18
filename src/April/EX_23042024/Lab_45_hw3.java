package April.EX_23042024;

import java.util.Scanner;

public class Lab_45_hw3 {
//    Check char is vowel, consonant.
//Program to Check if a Character is a Vowel or a Consonant.
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the character");
    char ch = sc.next().charAt(0);
//    char ch = 'i';

    if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ) {
        System.out.println(ch + " is vowel");
    }else
        System.out.println(ch + " is consonant");
}
}
