package May.EX_23052024;

public class Lab_144 {
    public static void main(String[] args) {
        // OOC ioc = new OOC();
         //OOC.STIC stic = ioc.new STIC();
         OOC.STIC stic = new OOC.STIC();//this is static class so no need to create moth instance

    }
    class OOC{
        static int a = 10;
        static String b = "beautiful";

        static class STIC{

      void show(){
    System.out.println("show the STIC");
}
        }
    }
}
