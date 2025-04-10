package Practise_queson;

public class reverse_sentence {
    public static void main(String[] args) {
        String sen = "Hello this world not good";
        String[] words = sen.split(" ");
        String revstr = "";

        for(String word : words ){
            String revword = "";
            for(int i = word.length()-1; i>=0; i--){
                revword+=word.charAt(i);

            }
            revstr += revword + " ";
        }
        System.out.println("org string: " + sen);
        System.out.println("reversed words:  " + revstr.trim());//remove extra space
    }
}
