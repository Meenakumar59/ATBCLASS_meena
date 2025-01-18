package May.EX_25052024.wrapper_class.Exception_pkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab_154 {
    public static void main(String[] args) throws FileNotFoundException {
        //exception - 2
        //checked - JVM does know
        //may be avilable pr may not be files
        try {
            FileInputStream file = new FileInputStream("c.//loh.open/");//java knows - add excepton throwing
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


        //un checked - jvm doen't know
        int i = 10;
        int a = 10/0; //run time error
        String s = null;
        s.trim();//jvm doent know
    }
}
