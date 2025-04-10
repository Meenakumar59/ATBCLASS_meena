package Practise_queson;

public class math_table {
    public static void main(String[] args) {
         printtable(2);
        System.out.println();
        printtable(5);
    }
    public static  void printtable(int num){
        System.out.println("Table of :" + num +  ":");
        for (int i = 0 ; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
