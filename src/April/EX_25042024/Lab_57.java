package April.EX_25042024;

import java.util.Scanner;

public class Lab_57 {
    public static void main(String[] args) {
//        check grade based on marks
//        99 = 99/10 -> 9.9 ->A
//        80 -> 80/10 -> 8 -> B grade
//
//
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks = sc.nextInt();
        marks = marks/10;
        switch (marks){
            case 9:
                System.out.println("Grade A");
                break;
            case 8:
                System.out.println("Grade b");
                break;
                case 7:
                System.out.println("Grade c");
                    break;
            default:
                System.out.println("D");
                break;

        }




    }
}
