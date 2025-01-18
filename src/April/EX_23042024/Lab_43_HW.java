package April.EX_23042024;

import java.util.Scanner;

public class Lab_43_HW {
//    1.Positive / Negative Number
//Program to Check if a Number is Positive, Negative, or Zero.
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number, will tell you positive or negative");
    int number = sc.nextInt();

    if(number > 0){
        System.out.println("The number is positive number");
    }else if (number == 0){
        System.out.println("The number is Zero number");
    }else{
        System.out.println("The number is negative number");
    }
}


}
