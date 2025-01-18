package May.EX_2052024;

public class Lab_83 {
    public static void main(String[] args) {
// == checks the reference s1 = meena ; s2 = beauty ; s3 = new string("meena")
//        sout(s1==s2) - true - location same
//        sout(s1==s3) - false sring and object area so their location is different
//        sout(s1.equals(s3) - true  - it checks the content
// .equals - check the content
        int[] a = {1,2,3,4,5};
        int[] b = {1,2,3,4,5};
        System.out.println(a==b);//false - their address is different '==' this check the refer but in string class is diff
        System.out.println((a.equals(b)));
        int[] c = b;
        System.out.println(c==b); //the location is same so true.
        System.out.println(a.equals(c));//coming from object area , doent check the content it checks only == ( reference )
// similar a== b and a.equals(b) same in array
   String n ="meena";
   String m = "meena";
    }
}
