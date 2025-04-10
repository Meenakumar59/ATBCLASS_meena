package practise_question_1;

public class palindrome_strbuilder {
    public static void main(String[] args) {
        String s = "hello";
        String revstr = new StringBuilder(s).reverse().toString();
        System.out.println(revstr);

    }
}
