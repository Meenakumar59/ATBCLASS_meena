package Assignments;

import java.util.Scanner;

public class Reverse_wf {
//    Reverse a String without using any function or using for loop.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String str = sc.next();
        for(int i = str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
    }
}
