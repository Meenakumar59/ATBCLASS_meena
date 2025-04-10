package practise_question_1;

public class prime_no {
    public static void main(String[] args) {
        int num = 6;
        if(num<=1){
            System.out.println("Th enumber is not prime");
        }
        boolean isprime = true;
        for(int i = 2; i*i <=num; i++){
            if(num%i==0){
                isprime = false;
            }

        }
        if(isprime){
            System.out.println("yes, its prime");
        }else{
            System.out.println("not a prime");
        }
    }
}
