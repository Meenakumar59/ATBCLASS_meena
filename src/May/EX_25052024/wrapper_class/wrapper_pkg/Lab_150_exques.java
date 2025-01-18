package May.EX_25052024.wrapper_class.wrapper_pkg;

public class Lab_150_exques {
    public static void main(String[] args) {
        Integer x = 400, y = 400;
        if (x == y)
            System.out.println("Same");
        else
            System.out.println("Not Same");
        //wrapper means object - in Object area - X and Y location is different
        // then it not equal
        Integer x1 = 40, y1 = 40;
        if (x == y)
            System.out.println("Same");
        else
            System.out.println("Not Same");

        Integer x2 = Integer.valueOf(40), y2 = Integer.valueOf(40);
        if (x == y)
            System.out.println("Same");
        else
            System.out.println("Not Same");


        //Integer X = new Integer(10);
        Integer Y = 10;

        // Due to auto-boxing, a new Wrapper object
        // is created which is pointed by Y
     //   System.out.println(X == Y);

        //important concept
//        == double checks - reference
//                == checks if string - values
//                .equals checks in case of value string
//                .equals checks  ref if int or other



    }


}
