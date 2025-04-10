package Practise_queson;

public class primeno {
    public static void main(String[] args) {
         int num = 31;
         int count = 0;
         if(num<=1){
             System.out.println("the num is not prime");
             return;
         }
         for(int i=2; i<=num/2; i++){
             if(num%i==0)
                 count++;
         }
         if(count>1){
             System.out.println("num is not prime");
         }else{
             System.out.println("the num is prime");
         }
    }
}
