package multilevel_inheritance;

public class Lab_130_multi_inherit {
    public static void main(String[] args) {
        grandfather gf = new grandfather();
        gf.home();

        father fat = new father();
        fat.home();

        child ch = new child();
        ch.home();
        //dynamic dispatch
        grandfather gf1 = new child();
        //child ch = new grandfather();
    }
}
