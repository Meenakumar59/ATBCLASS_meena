package practise_question_1;

public class reverse_test {
    public static void main(String[] args) {
        String  str = "Programming";
        String rev = "";
        char ch;
        for(int i =0;i<str.length();i++){
            ch = str.charAt(i);
            rev = ch+rev;
        }
        System.out.println(rev);
    }
}
