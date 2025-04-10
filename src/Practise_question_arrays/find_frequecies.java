package Practise_question_arrays;

import java.util.HashMap;

public class find_frequecies {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4, 2, 3, 5, 1, 1};

        // HashMap to store frequencies
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);

            //checks num exist or not , if it exists returns current valuse
            //and increment count and put used to update frequency count
        }

        // Print the frequency of each element
        System.out.println("Element Frequencies:");
        for (int key : frequencyMap.keySet()) {
            //keySet() returns all unique numbers in the array.
            //frequencyMap.get(key) fetches the count for each unique number.
            System.out.println(key + " → " + frequencyMap.get(key));
        }
    }
}


