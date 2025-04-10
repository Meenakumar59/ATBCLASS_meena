package Practise_prblm_1;

import java.util.Scanner;

public class pallindrome_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the strimhg, will tell ypu whether it is palindrome or not:");
        String input= sc.nextLine();
        boolean result = ispalindrome(input);
        if (result){
            System.out.println("It is a palindrome" +input);
        }else {
            System.out.println("Not a palimdrome:" );
        }
    }
    public  static  boolean ispalindrome(String str){
        String replace = str.replaceAll("\\s+","").toLowerCase();
        String reverse = "";
        boolean ans = false;
        for(int i=replace.length()-1;i>=0;i--){
            reverse = reverse+ replace.charAt(i);
        }
        if(replace.equals(reverse)){
            ans = true;
        }
       return ans;
    }


}