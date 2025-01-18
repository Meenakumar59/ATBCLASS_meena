package May.EX_25052024.wrapper_class;

public class iq_100 {
    public static void main (String[] args) {

//        String str= "Pramod", nstr="";
//        char ch;
//
//        System.out.print("Original word: ");
//        System.out.println("Pramod"); //Example word - explain in detail each code
//
//        for (int i=0; i<str.length(); i++)
//        {
//            ch= str.charAt(i); //extracts each character
//            nstr= ch+nstr; //adds each character in front of the existing string
//        }
//        System.out.println("Reversed word: "+ nstr);
//    }
   // public static void main(String[] args) {
        String s = "meena";
        String o = "";
        char ch ;
        System.out.println("original word; ");
        System.out.println("meena");
        for(int i=0; i<s.length();i++){
            ch = s.charAt(i);//extracts each char
            o= ch+o;

        }
        System.out.println("reversed word:" + o);
    }
}
