package Practise_question_arrays;

public class maximum_num {
    public static void main(String[] args) {
        int[] arr = {12,34,56,78};
        int maxim = arr[0];
        for(int num :arr){
            if(num>maxim)
                maxim=num;
        }
        System.out.println(maxim);
    }


}
