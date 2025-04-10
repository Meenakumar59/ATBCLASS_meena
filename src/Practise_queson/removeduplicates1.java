package Practise_queson;

public class removeduplicates1 {
    public static void main(String[] args) {
        String str = "Programiing";
        String  res = "";
        for(int i = 0; i<str.length(); i++){
           char ch = str.charAt(i);
           if(res.indexOf(ch)==-1){
               res += ch;

           }

        }
        System.out.println("enter origing string: " + str);
        System.out.println("removed duplicate string: " + res);
    }
}
