package April.EX_20042024;

import java.util.Scanner;

public class Lab_cuberoot_user {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x");
        double x = sc.nextDouble();
//        double x = sc.nextLine();
        System.out.println("Enter the value of y");
        double y = sc.nextDouble();
        System.out.println("Enter the value of z");
        double z = sc.nextDouble();

        double result;
        result = Math.cbrt((Math.pow(x,22) +Math.pow(y,2)- Math.abs(z)));
        System.out.println(result);
        sc.close();
    }
}
