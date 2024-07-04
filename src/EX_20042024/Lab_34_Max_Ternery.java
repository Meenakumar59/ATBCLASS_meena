package EX_20042024;

public class Lab_34_Max_Ternery {
    public static void main(String[] args) {
//        Max between 3 number with ternery operator
        int a = 5;
        int b = 10;
        int c = 60;
//        int Max_value = a>b && a>c?
//        int a = 10;
//        int b = 20;
//        int c = 5;

        int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
//        int max = (a > b) ? a : c;

        System.out.println("The maximum value is: " + max);


    }
}
