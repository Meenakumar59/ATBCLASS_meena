package May.EX_14052024;

public class Lab_123_parameter {
    public static void main(String[] args) {
        Lab_121_constructor objref1 = new Lab_121_constructor();
        Lab_121_constructor objref2 = new Lab_121_constructor();
//called - 2 times DC
//        Created - 1 time DC
        Lab_121_constructor objref3 = new Lab_121_constructor();
        objref3.name = "meena";
        System.out.println(objref3.name);
//        how do i change the value  ?
//        i can change in object class eg. objref3
        Lab_121_constructor objref4= new Lab_121_constructor("meena",87888877889l);
        System.out.println(objref4.name);
        System.out.println(objref4.mblno);
//         how do i change the value without typing here ?
//        i can change in the class using this eg. objref3
        Lab_121_constructor objref5= new Lab_121_constructor("Anu", 6768678686l);
        System.out.println(objref5.name);
        System.out.println(objref5.mblno);
//        Lab_121_constructor objref6= new Lab_121_constructor();
    }
}
