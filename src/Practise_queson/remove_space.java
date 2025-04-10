package Practise_queson;

public class remove_space {
    public static void main(String[] args) {
        String s = "heeloo world meeena";
        String rs = s.replaceAll("\\s","");
        System.out.println(rs);
    }
}
