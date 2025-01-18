package Assignments;

public class double_array {
    //    create a program to double an array and store it also
    public static void main(String[] args) {
        int[] array = {13,34,67,89,30};
        int[] array1= new int[5];
        for(int i=0; i<array.length; i++){
            array1[i]= array[i]*2;
        }
        System.out.println("printing array1");
        for(int j=0; j<array1.length; j++){
            System.out.println(array1[j]);
        }


    }
}
