package April.EX_23042024;

import java.util.Scanner;

public class Lab_42 {
    public static void main(String[] args) {
//         Triangle classifier

//        Write a program that clasifies triangle  based on its side lengths.
//        Given inputs values that representing the length of side

//        Three sides - equilateral triangle
//        Two sides - Isosceles triangle
//        no sides are equal - scalene triangle
//        = Assign the values
//        == compare the values
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the triangle , I will tell you about triangle");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();
        if((side1 == side2) && (side2==side3) && (side1 == side3)) {
            System.out.println("This is equilateral triangle");
        } else if ((side1 == side2) ||(side2==side3) || (side1 == side3)) {
            System.out.println("This is  Isosceles triangle ");
        }else {
            System.out.println("This is scalene triangle");
        }
    }
}
