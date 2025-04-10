package practise_question_1;

public class ispanidrome_test {
    public static void main(String[] args) {
        String str = "Madamghgf";
        boolean  result = ispalindrome(str);
        if(ispalindrome(str)){
            System.out.println("it is a palindrome  " + str);

        }else{
            System.out.println("not a palindrome");
        }

    }
    public static boolean ispalindrome(String str){

        String rep=str.replaceAll("\\s","").toLowerCase();
        String rev = "";
        boolean ans = false;
        for(int i =0;i<rep.length();i++){
            char ch = rep.charAt(i);
            rev = ch+rev;
            if(rev.equals(rep))
            ans=true;
        }
        return ans;
    }
}
