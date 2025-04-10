package practise_question_1;

public class string_immutable {
    public static void main(String[] args) {
        String s = "hello";
        String o = s.concat("world");
        System.out.println(o);
        System.out.println(s);
    }
}
