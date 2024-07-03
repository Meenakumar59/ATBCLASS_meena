package EX_18042024;

public class Lab_18Type_casting {
    public static void main(String[] args) {
//        type casting --> mold
//        byte a = 10;
//        int b = a; // Implicit casting (store small value into bigger container which mean == int)
//        JVM will do automatically u dont need specify
//        int b = (int)a;

//        int c = 400;
//        byte d = (byte) c; //Explicit
//        System.out.println(d);
//
        float course = 700f;
        float gst = 100.325f;
        double total = course+(int)gst;
        System.out.println(total);
//        widening - conversion of lower tupe to higher type
//        narrowing - high to low
    }
}
