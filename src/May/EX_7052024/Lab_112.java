package May.EX_7052024;

import java.util.Scanner;

public class Lab_112 {
//    Given an integer, , perform the following conditional actions:
//
//    If  is odd, print Weird
//    If  is even and in the inclusive range of  to , print Not Weird
//    If  is even and in the inclusive range of  to , print Weird
//    If  is even and greater than , print Not Weird
//    Complete the stub code provided in your editor to print whether or not  is weird.
        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int N = scanner.nextInt();
            if (N % 2 != 0) {
                System.out.println("Weird");
            } else {
                if (N > 20) {
                    System.out.println("Not Weird");
                } else if (N >= 2 && N <= 5) {
                    System.out.println("Not Weird");
                } else if (N >= 2 && N <= 5) {
                    System.out.println("Not Weird");
                } else if (N >= 6 && N <= 20) {
                    System.out.println("Weird");
                }
                scanner.close();
            }
        }
    }
