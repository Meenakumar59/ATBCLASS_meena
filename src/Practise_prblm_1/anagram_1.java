package Practise_prblm_1;

import java.util.Arrays;
import java.util.Scanner;
public class anagram_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE STRING1:");
        String str1 = sc.nextLine();
        System.out.println("Enter the string2:");
        String str2 = sc.nextLine();
        if(isAnagram(str1,str2)){
            System.out.println(str1 + "and  " + str2 + " are anagrams");
        }else {
            System.out.println(str1 + "and  " + str2 + " are not anagrams");
        }

    }
public  static boolean isAnagram(String str1,String str2){
    str1 = str1.replaceAll("\\s+","").toLowerCase();
    str2 = str2.replaceAll("\\s+","").toLowerCase();
    if(str1.length()!=str2.length()){
       return false;
    }

    char[] arr1 = str1.toCharArray();
    char[] arr2 = str2.toCharArray();

    Arrays.sort(arr1);
    Arrays.sort(arr2);

   return Arrays.equals(arr1,arr2);

}


}
