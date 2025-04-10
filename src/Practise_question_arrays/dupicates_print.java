package Practise_question_arrays;

import java.util.HashSet;

public class dupicates_print {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,5,3,1,2,5,7,5,8,4,5,5,5,6};
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        for(int num:arr){
            if(!seen.add(num)){
                duplicates.add(num);
            }
        }
        System.out.println("duplicate elements ; " + duplicates);
    }
}
