package April.EX_25042024;

import java.util.Scanner;

public class Lab_52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        char vowel = sc.next().toCharArray()[0]; //will print first character

//        System.out.println(v);
        char vowel = sc.next().charAt(0);//will print first character

//        toCharArray[0] - which means when user enter A --> "A" Scanner consider as string - start from index
        switch(vowel){
            case 'A':
                System.out.println("This is vowel");
            case 'I':
                System.out.println("This is vowel" + vowel);
            case 'E':
                System.out.println("This is vowel" + vowel);
            case 'O':
                System.out.println("This is vowel" + vowel);
            case 'U':
                System.out.println("This is vowel" + vowel);
            default :
                System.out.println("This is not vowel" + vowel);

        }
    }
}
