package Assignments;

public class max_sal_arr {
    public static void main(String[] args) {
//        find the max salary in input arrays {30,50,60,90,10,100,999}
        int[] salaries = {30,50,60,90,10,100,999};
        //        how to find max in array
        int max_salaries = Integer.MIN_VALUE;
        for(int i = 0 ; i<salaries.length ; i++){
            if(salaries[i]>max_salaries){
                max_salaries = salaries[i];
            }
        }

        int j = 0;
        while(j<salaries.length) {
            if(salaries[j]>max_salaries)
                max_salaries = salaries[j];
        }
        j++;
        System.out.println("Max saalries ---->" + max_salaries);
    }
}


