package RA;

public class bp {
    String name;
    String name2;
    bp step1(String name){
        System.out.println("1");
        this.name = name;
        return this;
    }
    bp step2(String name2){
        System.out.println("2");
        this.name2 = name2;
        return this;
    }
    bp step3(String status){
        System.out.println("completed");
        return this;
    }

    public static void main(String[] args) {
        bp BP = new bp();
        BP.step1("meena").step2("anu").step3("completed");

    }

}
