package Practise_queson;

public class count_no_words_str {
    public static void main(String[] args) {
        String s = "Hello my dear thangamee, you are so beautiful";
        String[] words = s.split("\\s");
        System.out.println("no o fwords : "+ words.length);
    }
}
