package May.EX_25052024.wrapper_class.Exception_pkg;

public class Lab_155 {
    public static void main(String[] args) {
        try {
            String s = args[5];//.ArrayIndexOutOfBoundsException
            int i = Integer.parseInt(s);//convert string into int//java.lang.NumberFormatException
            int a = 10 / i;
        }catch (Exception e){
            System.out.println(e.getMessage());//Arithmetic excption
        }
        //how to get this exception?
        //create and start the main thread
        //main thread do following tasks
        //1) collect the command line  arguments
        //2)create string array with CLA
        //3) Calls main method by passing string array as parameter eg.passing argument  value 5 5 5 5
        //Lab_155.main(5 5 5 5 5 5 5)
        //Now  control will be transferred from main thread to main method
        //whenn problem comes  in main- JVM
        //Create object class of identified exception class
        //exeption a = new excepton
    }
}
