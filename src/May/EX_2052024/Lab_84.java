package May.EX_2052024;

public class Lab_84 {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {1,2,3,4,5};
        System.out.println(a==b);//false - their address is different '==' this check the refer but in string location is same
        System.out.println((a.equals(b)));
        int[] c = b;
        System.out.println(c==b); //the location is same so true.
        System.out.println(a.equals(c));//coming from object area , doent check the content . it checks only == ( reference )
// similar a== b and a.equals(b) same in array
        System.out.println(a.equals(c));// objects.java - ref

        String n ="meena";
        String m = "meena";
        System.out.println(n==m);
        System.out.println(n.equals(m));//coming from string class ---> in string checks the content but not in array
//        Array ---> == and .equals are same both check the reference(loction)
        System.out.println(n.equals(m));//content - string.java
    }
}


