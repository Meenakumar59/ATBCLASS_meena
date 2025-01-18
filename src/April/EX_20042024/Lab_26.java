package April.EX_20042024;

public class Lab_26 {
    public static void main(String[] args) {
        String s1 = "Meena";
        s1.toLowerCase(); // here there are 2 strings: s1.to lowercase yet to be assign it is floating but create new string
        s1 = s1.toLowerCase();
        System.out.println(s1);
        String name = "Meena";
        String name2 = "Meena"; //ln no 9 and 10 ---will create 1 string
        String name3 = new String("Meena");//create 1 string Heap area / OA
    }
}
