package Practise_queson;

import java.util.HashSet;

public class duplicate_arr {

        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5, 1, 2};
            HashSet<Integer> seen = new HashSet<>();
            HashSet<Integer> duplicates = new HashSet<>();

            for (int number : numbers) {
                if (!seen.add(number)) {
                    duplicates.add(number);
                }
            }

            System.out.println("Duplicate elements: " + duplicates);
        }
    }


