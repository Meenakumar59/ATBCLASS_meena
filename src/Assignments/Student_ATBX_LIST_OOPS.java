package Assignments;

public class Student_ATBX_LIST_OOPS {
    public static void main(String[] args) {
        student meena = new student();
        meena.name = "Meena";
        meena.id = 123;
        meena.email = "meenakumar5999@gmail.com";
        meena.studstudying();

        course ATB6X = new course();
        ATB6X.coursename = "java,selenium";
        ATB6X.coursedetails();

        payment_oops makingpt = new payment_oops();
        makingpt.paymentmode = "UPI";
        makingpt.amount = "10000";
        makingpt.paymentdetails();
        makingpt.receiptid = "123ERDCF34";


    }


}
