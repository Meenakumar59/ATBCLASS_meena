package May.EX_14052024;

public class Lab_125_Bank {
    String Bankname;
    int  balance;
    String bankcode;
    //instance varibles
    Lab_125_Bank(){
        Bankname = "ICICI";//LOC VAR
        balance = 122;
        bankcode = "ICICI001";// def construct

    }
    public Lab_125_Bank(String Bankname, int balance) {
       this.Bankname  ="XYZ";
        this.balance = 500;
    }
    public Lab_125_Bank(String bankcode) {
        bankcode = bankcode;
    }
    public Lab_125_Bank(String Bankname, int balance, String bankcode) {
        Bankname = Bankname;
        balance = balance;
        bankcode = bankcode;
    }


    void printdetails(){
        System.out.println("bankname-->" + Bankname);
        System.out.println("balance-->" + balance);
        System.out.println("bancode-->" + bankcode);
    }

}
