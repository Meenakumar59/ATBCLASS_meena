package May.EX_25052024.wrapper_class.Exception_pkg;

public class ProblemF {
        int a = 10;
        int show(){
            try{
                System.out.println("In class -> " + a);
                return a;
            }catch (Exception e){
                System.out.println("Catch");
                a = 20;
                return a;
            }finally {
                System.out.println("I am Final");
            }
        }}


