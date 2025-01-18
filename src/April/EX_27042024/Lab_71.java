package April.EX_27042024;

public class Lab_71 {
    public static void main(String[] args) {
        for(int i = 0 ; i<= 10; i++) {
            System.out.println(i);
            if(i==5) {
                continue;
//                when conditon met it will again execute from for loop
            }
            System.out.println("print after!");
        }
    }
}
