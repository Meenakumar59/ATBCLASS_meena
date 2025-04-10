package practise_question_1;

public class vowel_count {
    public static void main(String[] args) {
        String str = "language";
        int vcount = 0;
        int ccount= 0;
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch =='e' || ch == 'i' || ch == 'o'  || ch == 'u'){
                vcount++;
            }else if((ch>='a' && ch<='z'))
ccount++;
            }
        System.out.println("vowel count : " + vcount + "consaonant count :" + ccount);
        }
    }

