package EX_20042024;

public class Lab_35_cube_root {
    public static void main(String[] args) {
// cube ro
        int x = 10;
        double squ_x = Math.pow(x,2);
        double y = 12.4;
        double squ_y = Math.pow(y,2);
        double z = Math.abs(56.78);
        double value = (squ_x +squ_y -z);
        System.out.println(value);
        double res = Math.cbrt(value);
        System.out.println(res);

    }
}
