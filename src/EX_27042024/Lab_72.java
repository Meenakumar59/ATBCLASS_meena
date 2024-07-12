package EX_27042024;

public class Lab_72 {
    public static void main(String[] args) {
        for(int i = 1; i<= 10; i++) {
            if(i%2 == 0) {
                System.out.println(" Number id even -->" + i);
                continue;
            }
            System.out.println("Number is odd -->" + i);
        }
    }
}
