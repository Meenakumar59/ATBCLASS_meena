package April.EX_23042024;

public class Lab_48_FIZZBUZZ {
    //    fizz buzz
//replacing any number divisible by three with the word "fizz",
//    and any number divisible by five with the word "buzz", and any number
//    divisible by both three and five with the word "fizzbuzz".
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FIZZ BUZZ");
            } else if (i % 3 == 0) {
                System.out.println("FIZZ");
            } else if (i % 5 == 0) {
                System.out.println("BUZZ");
            }else
                System.out.println(i);
        }
    }
}
