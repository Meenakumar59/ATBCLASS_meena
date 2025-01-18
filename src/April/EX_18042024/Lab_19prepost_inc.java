package April.EX_18042024;

public class Lab_19prepost_inc {
    public static void main(String[] args) {
//        Increement and decreement -
//        pre  - value is incremented first and then result is computed
//        ++a = a+1 value
        int a = 10;
        int b = ++a;
        System.out.println(b);

        int c = 13;
        int d = --c;
        System.out.println(c);



//       Post -   - value is used for first computing the result and then incr/decre

        int e = 10;
        int result = e++ ;
        System.out.println(result);
        System.out.println(e);

//        Result--> f = 10
//        e = 11 --> post increment

        int g = 10;
        int h = g--;
        System.out.println(g);
        System.out.println(h);
    }
}
