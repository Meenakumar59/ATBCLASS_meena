package May.EX_25052024.wrapper_class.Exception_pkg;

import java.io.File;
import java.io.FileReader;

public class Lab_157 {
    public static void main(String[] args) {
        try{
            String path = "c://mena.k";
            File file = new File(path);
            FileReader filereader = new FileReader(file);
        }catch (Exception e){
            System.out.println(e.getMessage());
       }
    }
}
