package May.EX_23052024.Static_kw;

public class Lab_141 {
    //static *wrapper class * exception java * enum
    //static - class , function  and data number
    public static void main(String[] args) {
//        ATB a = new ATB(98899889l);
//        ATB b = new ATB(7357899889l);
//        a.printDeatils();
//        b.printDeatils();
//        System.out.println(ATB.coursename);
        ATB C = new ATB(223322);
        ATB D=new ATB(223322);//static block print msg print once when
        // u create 2 objects because it loads class once

  }
    static {
        System.out.println("STB - Load one time when class is loaded");
    }
    {
        System.out.println("IIB - Instance initialization block - loaded whenever object is created ");
    }
    static class ATB{
        static String coursename = "ATM";//sattic var - common variavble
        long phnno;//instance var - not common for everypone

        public ATB(long phnno) {
            this.phnno = phnno;
        }
        void printDeatils(){
            System.out.println("your details" + this.phnno);
        }
    }
}
