package Practise_question_arrays;

public class min_num {
    public static void main(String[] args) {
         int[] arr = {34,5,1,45,87};
         int minimum = arr[0];
         for(int num: arr ){
             if(num<minimum){
                minimum=num;
             }
         }
        System.out.println(minimum);
    }
}
