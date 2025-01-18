package Assignments;

import java.util.Scanner;

public class squares {
//     1. given a integer N , generate and print an array containing
//    squares of all numbers from 1 to n
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter an integer");
    int integer = sc.nextInt();

//    create array to store squares
    int[] square = new int[integer];
// calculate square
    for(int i =1; i <=integer; i++){
        square[i-1] = i*i;

    }
//    print an array
    System.out.println("print all integers from 1 to " + integer + ":");
    for(int squares: square){
        System.out.println(squares + "");
    }


}
}
