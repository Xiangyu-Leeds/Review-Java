package stack_queue;

import java.util.EmptyStackException;
import java.util.Stack;

public class one {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println("stack:" + st);
        showpush(st, 1);
        showpush(st, 2);
        showpush(st, 3);
        showpop(st);
        showpop(st);
        showpop(st);

        try {                //捕获异常
            showpop(st);
        } catch (EmptyStackException e) {
            System.out.println("empty stack");
        }
    }
    static void showpush(Stack<Integer> st, int a) {
        st.push(a);
        System.out.println("push("+ a +")");
        System.out.println("statck: "+ st);
    }
    static void showpop(Stack <Integer> st) {
        System.out.print("pop -> ");
        int a =  st.pop();
        System.out.println(a);
        System.out.println("stack: "+ st);
    }

}