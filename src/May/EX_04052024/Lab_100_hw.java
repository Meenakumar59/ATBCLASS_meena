package May.EX_04052024;

public class Lab_100_hw {
    public static void main(String[] args) {
        String str = "Malayalam";
        System.out.println("orginal string----" + str);
        String reversed = "";
        for(int i = str.length()-1;i>=0;i--){
            reversed += str.charAt(i);

        }
        System.out.println("Reversed string----" + reversed);
    }
}
