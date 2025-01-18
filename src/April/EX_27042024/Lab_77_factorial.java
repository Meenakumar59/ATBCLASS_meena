package April.EX_27042024;

import java.util.Scanner;

public class Lab_77_factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long fact = 1;
        for(int i =1 ; i <= num ; i++){
            fact = fact*i;

        }
        System.out.println(fact);
        sc.close();
    }
}
