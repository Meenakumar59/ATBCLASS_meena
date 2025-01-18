package May.EX_14052024;

public class Automation_DC {
    public Automation_DC(String name) {
        this.name = name;
    }

    String name;
//    real time usage of DC - whereever use the first
    Automation_DC(){
        databaseConnection();
        Excel();
//public Automation_DC(String name) {
//            this.name = name;
//        }
    }
    void databaseConnection(){
        System.out.println("Database connection opened!");
    }
 void Excel(){
     System.out.println("Excel is opened");
 }
  void testcase1(){
      System.out.println("TC1" + this.name);
  }
    void testcase2(){
        System.out.println("TC1" + this.name);
    }
    public static void main(String[] args) {
        Automation_DC TC1 = new Automation_DC("T1");
        Automation_DC TC2 = new Automation_DC("T2");
        System.out.println(TC1.name);
        TC1.testcase1();
        System.out.println(TC1.name);
        TC2.testcase2();

    }
}
