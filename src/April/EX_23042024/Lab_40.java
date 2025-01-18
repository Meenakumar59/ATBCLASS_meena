package April.EX_23042024;

import java.util.Scanner;

public class Lab_40 {
    public static void main(String[] args) {
//        number ==20,>,<
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 20) {
            System.out.println("num>20");
        } else if (number < 10) {
            System.out.println("num<10");
        } else {
            System.out.println("number is between 10 and 20");
        }
    }
}
