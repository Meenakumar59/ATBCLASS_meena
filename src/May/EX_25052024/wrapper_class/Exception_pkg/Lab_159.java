package May.EX_25052024.wrapper_class.Exception_pkg;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab_159 {
    public static void main(String[] args) {
        try {
            FileReader filereader = new FileReader(new File("c:htips"));//checked
        } catch (FileNotFoundException e) {


        }
    }
}
