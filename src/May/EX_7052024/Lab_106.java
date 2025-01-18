package May.EX_7052024;

public class Lab_106 {
    public static void main(String[] args) {
        main(8);
        main("meena");
        main("name", "meena");
        String[] names = {"meena","raji"};
//        main();

    }
    static void main(int a){
        System.out.println(a);
    }
    static void main(String a){
        System.out.println(a);
    }
    static String main(String a , String b){
        System.out.println(a);
        return a;
    }

    static void god(){
        main(new String[]{"meena"});
    }
}
