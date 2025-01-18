package May.EX_04052024;

public class Lab_93_2d_array {
    public static void main(String[] args) {
        int[] [] arr2d = {
                {12,23,35},
                {23,10,56},
                {10,20,40}
        };
     for(int i = 0; i< arr2d.length; i++){
         for(int j = 0; j< arr2d.length; j++){
             System.out.println(arr2d[i][j]);
         }
     }
    }
}
