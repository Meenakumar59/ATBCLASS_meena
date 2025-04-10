package Practise_queson;

import java.util.Scanner;

public class primeno1 {

        public static void main(String[] args) {
            //int num = 61 ;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number");
            int num = sc.nextInt();

            if (num <= 1) {
                System.out.println("The number is not prime");
                return;
            }

            boolean isPrime = true;
            for (int i = 2; i * i <= num; i++) { // Check up to √num
                if (num % i == 0) {
                    isPrime = false;
                    break; // Exit the loop early if a divisor is found
                }
            }

            if (isPrime) {
                System.out.println("The number is prime");
            } else {
                System.out.println("The number is not prime");
            }
        }
    }

