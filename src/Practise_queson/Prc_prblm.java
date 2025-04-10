package Practise_queson;

public class Prc_prblm {
    public static void func(int a , int b){
        int ans = 1;
        for(int i = 0; i<b; i++){
            //ans *= a;
            ans = ans*a;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        func(2,5);
    }
}
