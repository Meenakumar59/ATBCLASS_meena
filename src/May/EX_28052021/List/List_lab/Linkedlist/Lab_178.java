package May.EX_28052021.List.List_lab.Linkedlist;

import java.util.Stack;

public class Lab_178 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.add(4);//push and add - no difference
        System.out.println(stack);
        System.out.println(stack.pop());//pop will removw at the top of the element
        //here 4
        System.out.println(stack);
        System.out.println(stack.peek());//peak just see which elemnt is at the top
        //System.out.println(satck);
    }
}
