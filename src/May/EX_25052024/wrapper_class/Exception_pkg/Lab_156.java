package May.EX_25052024.wrapper_class.Exception_pkg;

public class Lab_156 {
    public static void main(String[] args) {
        try{
        String s = args[5];//.ArrayIndexOutOfBoundsException
        int i = Integer.parseInt(s);//convert string into int//java.lang.NumberFormatException
        int a = 10 / i;
    }catch(ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e    ){
            System.out.println("Problem with you code");//Arithmetic excption
    }catch (Exception e){
            System.out.println(e.getMessage());//can have multiple catch//exception is parent class
        }catch (Throwable e){//father of exception
            System.out.println("something went wrong");
        }finally {
            System.out.println("final program"); //final is keyword , finalyy belongs to exception

        }
                //e.printStackTrace();
    }
}
