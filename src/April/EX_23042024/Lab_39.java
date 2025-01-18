package April.EX_23042024;

import java.util.Scanner;

public class Lab_39 {
    public static void main(String[] args) {
//        Find max num in two
        System.out.println("Enter num1");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        System.out.println("Enter num2");
        int num2 = sc.nextInt();
        int max = Math.max(num1,num2);
        System.out.println(max);

        if(num1>num2){
            System.out.println("Max is -->"+num1);
        }else {
            System.out.println("Max is -->"+num2);
        }
    }
}
