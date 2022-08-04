package stack_queue;

import java.util.*;

//Queue的实现类有LinkedList和PriorityQueue。最常用的实现类是LinkedList。
public class two {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList();
        queue.offer("元素A");
        queue.offer("元素B");
        queue.offer("元素C");
        queue.offer("元素D");
        queue.offer("元素E");
        System.out.println(queue.peek());
        while (queue.size() > 0) {
            String element = queue.poll();
            System.out.println(element);
        }
        List<Integer> a = new ArrayList<>();
        a.add(2);
        Object[] s =  a.toArray();
        System.out.println(s[0]);
        String o =new String("sb");
        String e = new String("sb");
        System.out.println(o.equals(e));



    }

}
