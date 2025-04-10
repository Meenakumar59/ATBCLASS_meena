package Practise_queson;

public class vowel_print_start {

    public static void main(String[] args) {
        String str = "Meenatchikumar";
        String vowels = "aeiouAEIOU";
        int vowelCount = 0;
        String result = str;

        for (char ch : str.toCharArray()) {
            if (vowels.indexOf(ch) != -1) { // If character is a vowel
                vowelCount++; // Increase vowel occurrence count
                result = result.replaceFirst(String.valueOf(ch), "*".repeat(vowelCount));
            }
        }

        System.out.println("Modified String: " + result);
    }
}
