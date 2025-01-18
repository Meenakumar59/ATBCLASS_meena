package May.EX_7052024;

public class Lab_104 {
    public static void main(String[] args) {
//        return with parameter
        sum_2_num(4,7);

//        return with non parameter
        return_2_pm();

//         non retrun with parameter
        non_return("meena");

//         non retrun with out parameter
        non_return_wp();



    }
//     return with parameter
    static int sum_2_num(int a, int b) {
        return a +b;
    }
//     return with non parameter
    static void return_2_pm(){
        System.out.println("retrun with no parameter");
    }
//    non return with parameter
    static void non_return(String name){
        System.out.println("helo " + name);
    }
//    non return without parameter
    static void non_return_wp(){
        System.out.println("non retrun without parameter");

    }
//    four types of function
//            return with parameter
//            return with non parameter
//    non retrun with parameter

//            non return with out parameter


}
