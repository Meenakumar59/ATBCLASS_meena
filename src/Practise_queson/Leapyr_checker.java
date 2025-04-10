package Practise_queson;

public class Leapyr_checker {
    public static void main(String[] args) {
        int yr = 2024;
        boolean isleapyr = false;
        if((yr%4==0 && yr%100 != 0)||(yr%400==0)){
            isleapyr = true;
        }if(isleapyr){
            System.out.println("I t is a leap year : " + yr);
        }else{
            System.out.println(" Not a leap year");
        }
    }
}
