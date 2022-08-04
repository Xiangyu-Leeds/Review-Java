package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class mod_count {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("java");
        list.add("atguigu");
        list.add("world");

        //以下代码没有发生ConcurrentModificationException异常
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String str = iterator.next();
            if("atguigu".endsWith(str)){
                list.remove(str);
            }
        }
        System.out.println(list);

    }
}
