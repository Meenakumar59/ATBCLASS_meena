package April.EX_23042024;

import java.util.Scanner;

public class Lab_41 {
    public static void main(String[] args) {
//        Write a program for grade checker
//        calculate and displays the letter grade given numerical score (Eg:A,B,C,D)
//        A:90/100
//        B:80/89
//        C;70/79
//        D:40
//        1.Find the user input
//        score data type? int
//                grade->return_>data type? char
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Mark");
        double score = sc.nextDouble();

char grade = 'f';


        if (score >= 90 && score <=100) {
            grade = 'A';
        } else if (score >= 70  && score<= 89) {
grade = 'B';
        }else if (score >= 60  && score<= 79) {
            grade = 'C';
        }else{
            grade = 'F';
        }
        System.out.println("your Grade is -->" + grade);
    }
}
