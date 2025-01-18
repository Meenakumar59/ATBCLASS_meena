package Assignments;

import java.util.Scanner;

public class Max_min_array_3 {
//    given an array find the max and min
public static void main(String[] args) {
//    read input
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number of elements in the array");
    int n = sc.nextInt();
// create an array and store the elements
    int[] number = new int[n];
    //
    System.out.println("enter the elements in the array");
    for(int i = 0; i <n; i++){
        number[i] = sc.nextInt();
    }

//    initializing max and min
    int max_num = Integer.MIN_VALUE;
    int min_num = Integer.MAX_VALUE;


//    find maximum and minimum
    for(int i = 0;i<n; i++){
        if(number[i]>=max_num){
            max_num = number[i];
        }
        if(number[i]<min_num){
            min_num = number[i];
        }
    }
    System.out.println("The maximum number is " + max_num);
    System.out.println("The minimum number is " + min_num);
}
}
