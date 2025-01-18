package Lab_Map;

import java.util.Enumeration;
import java.util.Hashtable;

public class Lab_190_hashtable {
    public static void main(String[] args) {
        Hashtable<String,Integer> table = new Hashtable<>();
        table.put("Meena" , 25);
        table.put("Iniyan" , 2);
        table.put("Amma" , 46);
        System.out.println(table);
        //hoe to print values
        //iterator cant able to use
        //use legacy enumeratio class
        Enumeration<String> e = table.keys();
        while (e.hasMoreElements()){
            String key = e.nextElement();
            System.out.println(key + ":"   + table.get(key));
        }

    }
}
