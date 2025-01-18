package June.EX_01062024.Lab_setss;

import java.util.HashSet;
import java.util.Set;

public class Lab_185_IQ {
    public static void main(String[] args) {
        int[] arr = {1 ,1 ,2, 3, 4, 4 ,5 ,6, 7 ,8, 8};
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for(int num:arr){
            if(!seen.add(num)){
                //element already seen so return false
                duplicates.add(num);
            }
        }
        System.out.println(duplicates);
    }
}
