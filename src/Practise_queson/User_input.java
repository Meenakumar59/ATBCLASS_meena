package Practise_queson;

import java.util.Scanner;

public class User_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
       //System.out.println();
        //read  a line text enteed by user
        String name = scanner.nextLine();
        System.out.println("Enter age");
        int age = scanner.nextInt();
        System.out.println("hello,  "   + name + "your age " + age);
    }
}
