package June.EX_01062024.Lab_setss;

import java.util.TreeSet;

public class Lab_183 {
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(80);
        tree.add(20);
        tree.add(50);
        tree.add(17);
        tree.add(null);
       // tree.add("Meena"); - classcast exception throw
        System.out.println(tree);

    }
}
