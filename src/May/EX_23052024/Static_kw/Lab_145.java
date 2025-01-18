package May.EX_23052024.Static_kw;

public class Lab_145 {
    public static void main(String[] args) {
        counter a = new counter();
        counter b = new counter();
        counter c = new counter();
        a.displaycount();
        b.displaycount();
        c.displaycount();
        //1. static int loaded
        //2. a.instance class load - constructor class called - count incrreement
        //intilaized value 0 - 1
        //3.b is loaded 1-2
        //4.c is loaded 2-3 increement
        //now value is 3 - it is shared to all because all objects share the
        //same static variable
    }
}
class counter{
    static int count=0;

    public counter() {
        count++;
    }
    void displaycount(){
        System.out.println("count the fn -->" + count);
    }


}
