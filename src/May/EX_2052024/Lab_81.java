package May.EX_2052024;

public class Lab_81 {
    public static void main(String[] args) {
        int[] ages = {23,56,34,67,89};
        System.out.println(ages[4]);
//         case 1: values are assigned

        int[] ages1 = new int[5];
        System.out.println(ages1.length);
//         values not designed but default value is 0
        ages1[4] = 34;
        System.out.println(ages1[4]);

        String[] names = { "meena", "anu" , "appa" ,"amma"};
        System.out.println(names.length);
    }
}
