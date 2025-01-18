package May.EX_25052024.wrapper_class.Exception_pkg;

public class Bank {
    private String curency;
   private Integer amount;

    public Bank(String curency, Integer amount) {
        this.curency = curency;
        this.amount = amount;
    }

    public String getCurency() {
        return curency;
    }

    public void setCurency(String curency) {
        this.curency = curency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    public Integer add1(Bank bankname) throws Exception {

            if(!bankname.curency.equalsIgnoreCase("INR")) {
                throw new Exception("Currency doesn't match");
            }
        Integer sum = this.amount + bankname.amount;
        return sum;
    }
    public Integer add(Bank bankname)  {
        try{
        if(!bankname.curency.equalsIgnoreCase("INR")) {
            throw new Exception("Currency doesn't match");
        }
        } catch(Exception e){
            throw new RuntimeException(e);
           // can we use ? try and catch wiht using conditioon - yes and without using
            //try and catch also use condition
        }
        Integer sum = this.amount + bankname.amount;
        return sum;
    }
}
