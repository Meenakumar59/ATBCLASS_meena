package practise_question_1;

public class vowel_replace_star {
    public static void main(String[] args) {
        String str = "MEENATCHIKUMAR";
        String vowel = "aeiouAEIOU";
        String result = str;
        int vowelcount = 0;
        for(char ch : str.toCharArray()){
            if(vowel.indexOf(ch)!=-1){
                vowelcount++;
                result=result.replaceFirst(String.valueOf(ch),"*".repeat(vowelcount));
            }

        }
        System.out.println(result);
    }
}
