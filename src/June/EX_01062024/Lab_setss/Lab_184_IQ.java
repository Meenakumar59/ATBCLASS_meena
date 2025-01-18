package June.EX_01062024.Lab_setss;

import java.util.HashSet;
import java.util.Set;

public class Lab_184_IQ {
    public static void main(String[] args) {
        //Given an array of integer, return an array of unique elemnts
        //Input :  1 1 2 3 4 4 5 6 7 8 8
        //Output : 1 2 3 4 5 6 7 8

        int[] input = {1 ,1 ,2, 3, 4, 4 ,5 ,6, 7 ,8, 8};
        Set uniqueset = new HashSet<>();
        for(int num : input){
            uniqueset.add(num);
        }
        System.out.println(uniqueset);
        //How to print duplicar=te elemnt
    }
}
