package Practise_question_arrays;

import java.util.Arrays;

public class second_largest {
    public static void main(String[] args) {
        int[] arr = {23,45,32,87};
        Arrays.sort(arr);

        System.out.println(arr[arr.length-2] + " sec largest number");

    }
}
