package April.EX_25042024;

public class Lab_54 {
    public static void main(String[] args) {
////        JDK > 13
//        int item_code = 001;
//        switch(item_code){
//            case 001,002,003:
//                System.out.println("mech gadgets");
//                break;
//            case 004,005,006:
//                System.out.println("mech gadgets");
//                break;
//            default:
//                System.out.println("default");

        int itemcode = 001;
        switch (itemcode) {
            case 001 -> System.out.println(" Its a phone");// advantage of  -> is break no need
            case 002,003,004 -> System.out.println(" Its a phone,lap and headphone");
            case 005 -> System.out.println(" Its a ipad");
            default -> System.out.println("no gadgets");
        }
        char ch = 'a';
        switch(ch){
            case 'a','e','i','o','u' -> System.out.println("voewel");
            default -> System.out.println("consoanat");
        }
    }
}
