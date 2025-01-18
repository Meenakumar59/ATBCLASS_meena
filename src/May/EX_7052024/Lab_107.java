package May.EX_7052024;

public class Lab_107 {
    public static void main(String[] args) {
        f1();
        String[] names = {"meena","anu","amu"};
        String[] names1 = new String [2];
        names1[0] = "yalini";
        names1[1] = "iniyal";
        f1(names);
        f1(names1);
        System.out.println(names1);
    }
    static void f1(String[] a){
       for(String names : a){
           System.out.println(names);
       }
    }
    static void f1(){
        f2();
        System.out.println("f1");
    }

    static void f2(){
        System.out.println("f2");
    }
}
