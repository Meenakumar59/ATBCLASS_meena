package April.EX_20042024;

public class Lab_24_string {
    public static void main(String[] args) {
//        String ? - bunch of character
        String name = "Meena";//Assignment operator
        String name1 = new String("Kumar");//New operator
//        both of them,actually storing in a different way
//                how they store the value in JVM?
        System.out.println(name);
        System.out.println("your name is -> " +name);
        System.out.printf("your name is ->%s" , name);
        System.out.println("\n -----------------");
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        int age = 10;
        char c = 'a';
        boolean b = true;

//        Primitive data type - int, byte, short, long , double and float , boolean and char - All them don’t have extra functionality

//        Non primitive data type - Extra functionalitites

//         Java is not fully OOPS because - Primitive is not type of class
//         Object oriented should be a class format
//       Java is not not pure object oriented

    }
}
