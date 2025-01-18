package April.EX_25042024;

import java.util.Scanner;

public class Lab_58_Arithmetic_switch {
//    Switch Java Program
//Program to Perform Arithmetic Operations
//Take a input from user, input1, input2 as int and ask the user what you want to do, enter char
// +,*,/ ,%, - , you will share the result by using the switch.
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number");
    int num1 = sc.nextInt();
    System.out.println("Enter the second number");
    int num2 = sc.nextInt();
    System.out.println("enter the operator (+ ,-,*,/,%) :");
    char operator = sc.next().charAt(0);
    double result;
    switch(operator){
        case '+' :
            result = num1 + num2 ;
            System.out.println("operation is addition ->" + result);
            break;
        case '-' :
            result = num1 - num2 ;
            System.out.println("operation is subtraction ->" + result);
            break;
        case '*' :
            result = num1 * num2 ;
            System.out.println("operation is multiplication ->" + result);
            break;
        case '/' :
            result = num1 / num2 ;
            System.out.println("operation is division ->" + result);
            break;
        case '%' :
            result = num1 & num2 ;
            System.out.println("operation is amodulus ->" + result);
            break;
        default :
            System.out.println("operation is none");

    }
}
}
