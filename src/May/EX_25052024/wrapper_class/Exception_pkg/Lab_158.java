package May.EX_25052024.wrapper_class.Exception_pkg;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab_158 {
    public static void main(String[] args) throws FileNotFoundException {
        readfile("c://htps");
//        String path = "c://mena.k";
//        File file = new File(path);
//        FileReader filereader = new FileReader(file);
    }

    static void readfile(String filename) throws FileNotFoundException {
        int a = 0;
        int b = 10 / 0;
        //will give problem as strack trace - first line no 9 then 16
        FileReader filereader = new FileReader(new File("c:htips"));
//        try {
//            FileReader filereader = new FileReader(new File("c:htips"));//checked
//        }catch(Exception e){
//            System.out.println("file not found");
//            }
        }
    }

