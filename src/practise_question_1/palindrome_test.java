package practise_question_1;

public class palindrome_test {
    public static void main(String[] args) {
        String s = "Madam";
        String rev = "";
        for(int i = 0; i<s.length();i++){
            char ch = s.charAt(i);
            //rev = rev+ch;
            rev = ch+rev;

        }
        System.out.println(rev);
    }
}
