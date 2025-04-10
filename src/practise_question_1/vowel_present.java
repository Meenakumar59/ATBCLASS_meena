package practise_question_1;

public class vowel_present {
    //     Write a Java program to check if a vowel is present in a string.
    public static void main(String[] args) {
        String str = "meenatchi";
        if (isvowelpresent(str)) {
            System.out.println("vowel");
        } else {
            System.out.println("not a vowel");
        }

    }

    public static boolean isvowelpresent(String str) {
        String vowel = "aeiouAEIOU";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (vowel.indexOf(ch) != -1) {
                return true;
            }
        }

return false;
    }
}
