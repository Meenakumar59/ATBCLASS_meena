package EX_18042024;

public class Lab_21 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
//        part A --> EXP 1 - 11 --> a - 11
//        part B --> EXP 2 - 11 --> a - 12
//        part C --> EXP 3 - 12 --> a - 13
        System.out.println(a);
    }
}
