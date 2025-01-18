package May.Encapsulation;

public class ICICI {
    //encapsulating data memebers using function only
    //1.private
    //2.constructor
    //3.getter setterk
   private String name;
   private long balance;

    public ICICI(long balance, String name) {//making private contructor waste of time
        this.balance = balance;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        if(balance>0){
            this.balance = balance;
        }else{
            System.out.println("not allowed");
        }

    }
}
