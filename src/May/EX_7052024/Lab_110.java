package May.EX_7052024;

import java.util.Scanner;

public class Lab_110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if(N%2==0){
            System.out.println("Not Weird");
        }else {
        System.out.println("Weird");
        // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");


        scanner.close();
    }
}


}
