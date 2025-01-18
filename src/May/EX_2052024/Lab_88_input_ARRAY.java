package May.EX_2052024;

import java.util.Scanner;

public class Lab_88_input_ARRAY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];
        System.out.println("Enter the 1st marks");
        marks[0] = sc.nextFloat();
        System.out.println("Enter the 2 marks\"");
        marks[1] = sc.nextFloat();
        System.out.println("Enter the 3 marks\"");
        marks[2] = sc.nextFloat();
        System.out.println("Enter the 4 marks\"");
        marks[3] = sc.nextFloat();
        System.out.println("Enter the 5 marks\"");
        marks[4] = sc.nextFloat();
//
//        for (int i = 0; i < marks.length; i++) {
//            if (marks[i] < 25) {
//                System.out.println("This subject is fail" + marks[i]);
//            }
//            System.out.println(marks[i]);
//        }
        int j = 0;
        while (j < marks.length) {
                System.out.println(marks[j]);
                j++;
            }

        }
    }

