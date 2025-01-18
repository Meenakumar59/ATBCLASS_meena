package April.EX_23042024;

// Program to check leap year 2024
//

import java.util.Scanner;

public class Lab_47_hw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//            2024%4 =0 - True && 2024%100 = 24!= 0- false || 2024%400 ==0
//            T && F || T
        System.out.println("Leap year!!!");
    }else{

                System.out.println("not a leap year!!!");
            }
        }
    }

