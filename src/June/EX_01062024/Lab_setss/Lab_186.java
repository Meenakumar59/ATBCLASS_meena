package June.EX_01062024.Lab_setss;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Lab_186 {
    public static void main(String[] args) {
        //QUEUE - first in first out FIFO
        Queue aadhar = new PriorityQueue();
        //ordermaintain, sorting
        //duplicate allowed
        //null not allowed
        aadhar.add("B");
        aadhar.add("C");
        aadhar.add("D");
        aadhar.add("A");
        aadhar.offer("B");
//        System.out.println(aadhar);
//        System.out.println(aadhar.peek());
//        System.out.println(aadhar.poll());

//        for(Object obj : aadhar){
//            System.out.println(obj);
//        }
        Iterator it = aadhar.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
