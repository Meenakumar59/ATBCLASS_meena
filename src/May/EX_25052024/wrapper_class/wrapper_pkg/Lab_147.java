package May.EX_25052024.wrapper_class.wrapper_pkg;

public class Lab_147 {
    public static void main(String[] args) {
        int x = 10;//type integer
        //String y = x; - not possible
      //  String y = String(x);- not possible type casting
        String y = String.valueOf(x); //primitive to wrapper
        System.out.println(y);//type - string bcse it has string.value

        Character ch = 'a'; //wrapper to primitive - unboxing - automatically
        char s = ch; //
        double  d= 809/.90;
        Double d1 = 799.00;
        Float f = 123.98F;
        Boolean t = true;
        Long l = 12992l;// all are wrapper class

       // //wrapper class is used for to convert primitive data types into obhects
         Integer ab = new Integer(5) ;//deprecated this afer JDK 9 - both these are valid
        Integer iobj =Integer.valueOf(5);

        Integer a = 67;//autoboxing (Primitive --> wrapper) - automatically done

        System.out.println(Integer.max(5,8));
        System.out.println(Integer.sum(4,7));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        ///these are the advantages for the extra functionalities
    }
}
