package collection;

import java.util.Collections;
import java.util.LinkedList;
//Stack与LinkedList都能作为栈结构，对外表现的功能效果是一样，但是它们的物理结构不同，
// Stack的物理结构是顺序结构的数组，而LinkedList的物理结构是链式结构的双向链表。我们推荐使用LinkedList。
public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        //入栈
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
//        char w ='s';
//        String w1 ="2";
//        w1.equals("3");
        System.out.println(list);
       Collections.reverse(list);
        System.out.println(list);
        System.out.println(list.peek());
        System.out.println(list.peekLast());
        System.out.println(list.peekFirst());

        //出栈： LIFO（后进先出）
        System.out.println(list.removeFirst());//3
        System.out.println(list.removeFirst());//2
        System.out.println(list.removeFirst());//1
        //栈空了，会报异常java.util.NoSuchElementException
       // System.out.println(list.removeFirst());


        LinkedList<Integer> list1 = new LinkedList<>();  //队列
        //入队
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(3);

        //出队， FIFO（先进先出）
        System.out.println(list1.pollFirst());//1
        System.out.println(list1.pollFirst());//2
        System.out.println(list1.pollFirst());//3
        //队空了，返回null
       // System.out.println(list1.pollFirst());//null



        LinkedList<String> l = new LinkedList<>();
        l.addFirst("东");//也可以写为l.push("东")
        l.addFirst("南");
        l.addFirst("西");
        l.addFirst("北");
        System.out.println(l);
        l.removeFirst();//也可以写为l.pop();
        l.removeFirst();
        l.removeFirst();
        System.out.println(l);
        LinkedList<String> L = new LinkedList<>();
        L.addLast("黑");
        L.addLast("红");
        L.addLast("梅");
        L.addLast("芳");
        System.out.println(L);
        L.removeLast();
        L.removeLast();
        L.removeLast();
        System.out.println(L);


    }
}
