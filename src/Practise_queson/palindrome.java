package Practise_queson;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input: ");
        String input = sc.nextLine();
        boolean result = isPalindrome(input);
        if (result) {
            System.out.println("tell u palindrome or not"  + input + "palindrome!!!");
        } else {
            System.out.println("It is  " + input + "Not a Palindrome");
        }
        sc.close();
    }
      public static boolean isPalindrome(String str)
        {
            String replace = str.replaceAll("\\s+", "").toLowerCase();
            System.out.println(replace);
            // Initializing an empty string to store the reverse
            // of the original str
        //String str= "Madam";
            String rev = "";

            // Initializing a new boolean variable for the
            // answer
            boolean ans = false;
for(int i =0; i<replace.length();i++){
    char ch = replace.charAt(i);
              rev = ch+rev;

}
//            for (int i = replace.length() - 1; i >= 0; i--) {
//                char ch = replace.charAt(i);
//                rev = ch+rev;
//               // rev = rev + replace.charAt(i);
//            }

            // Checking if both the strings are equal
            if (replace.equals(rev)) {
                ans = true;
            }
            return ans;
        }
    }

