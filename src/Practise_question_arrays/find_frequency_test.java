package Practise_question_arrays;

import java.util.HashMap;

public class find_frequency_test {
    public static void main(String[] args) {
        int[] arr ={1,2,3,3,4,5,3,1,2,5,7,5,8,4,5,5,5,6};
        HashMap<Integer,Integer> freqmap = new HashMap<>();
        for(int num:arr){
            freqmap.put(num,freqmap.getOrDefault(num, 0)+1);
        }
        System.out.println("frequencies");
        for(int key : freqmap.keySet()){
            System.out.println(key + " -->" + freqmap.get(key));
        }
    }
}
