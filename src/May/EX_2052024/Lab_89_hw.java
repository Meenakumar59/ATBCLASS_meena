package May.EX_2052024;

import java.util.Scanner;

public class Lab_89_hw {
//   1. create a program which takes arrays and print all the marks
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float[] marks = new float[5];
    System.out.println("Enter the Tamil mark" );
    marks[0] = sc.nextFloat();
    System.out.println("Enter the English mark" );
    marks[1] = sc.nextFloat();
    System.out.println("Enter the maths mark" );
    marks[2] = sc.nextFloat();
    System.out.println("Enter the science mark");
    marks[3] = sc.nextFloat();
    System.out.println("Enter the social mark");
    marks[4] = sc.nextFloat();


    for(float i = 0; i< marks.length; i++){
        System.out.println(marks);
    }

}
}
