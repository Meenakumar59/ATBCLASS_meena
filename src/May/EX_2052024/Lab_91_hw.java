package May.EX_2052024;

public class Lab_91_hw {
    public static void main(String[] args) {
//        find the max salary in input arrays {30,50,60,90,10,100,999}

   double[] salary = {30,50,60,90,10,100,999};
   //double max = salary[0];
   double maximum = Integer.MIN_VALUE;//-2147483647 to 2147483647
   for(int i = 0; i< salary.length; i++){
       if(salary[i]>maximum){
           maximum = salary[i];
       }

   }
        System.out.println("max salry" + maximum);
    }
}