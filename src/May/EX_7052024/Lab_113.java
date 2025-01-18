package May.EX_7052024;

import java.util.Scanner;

public class Lab_113 {
    public static void main(String[] args) {
//        Given an integer N * I,1<I<10 , print its first 10 multiples. Each multiple
//        (where ) should be printed on a new line in the form: N x i = result.

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();

        // Loop to calculate and print the multiples of N
        for(int i = 1; i <= 10; i++) {
            int result = N * i;
            System.out.printf("%d x %d = %d\n", N, i, result);
        }

    }}

