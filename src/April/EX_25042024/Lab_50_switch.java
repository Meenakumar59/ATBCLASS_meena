package April.EX_25042024;

import java.util.Scanner;

public class Lab_50_switch {
    public static void main(String[] args) {
//         create  a program  days using switch case
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nymber , will tell u day");
        int day = sc.nextInt();

        switch (day) {
            case 1 :
                System.out.println("Mon!!");
                break;
            case 2 :
                System.out.println("Tues!!");
                break;
            case 3 :
                System.out.println("Wed!!");
                break;
            case 4 :
                System.out.println("Thurs!!");
                break;
            case 5 :
                System.out.println("Fri!!");
                break;
            case 6 :
                System.out.println("Sst!!");
                break;
            case 7 :
                System.out.println("Sun!!");
                break;
            default:
                System.out.println("The only 1 to 7 numbers are allowed");


        }
    }
}
