package RA;

public class noDesignPattern {
    //static or instance
    public void  step1(){
        System.out.println("step1");
    }
    public void step2(){
        System.out.println("step2");
    }

    public static void main(String[] args) {
        noDesignPattern dp = new noDesignPattern();
     //   dp.step2().step2(); - NP
        dp.step1();
        dp.step2();
    }
}
