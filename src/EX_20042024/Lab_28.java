package EX_20042024;

public class Lab_28 {
    public static void main(String[] args) {
        String nmae = "Learning Java";
        String nmae1 = "Learning Java";
        String nmae2 = new String("Learning Java");

        System.out.println(nmae == nmae1);//Checks reference

        System.out.println(nmae == nmae2);// check ref string and OA so reference are not equal -- false

        System.out.println(nmae.equals(nmae2)); //checks value -- true
    }
}
