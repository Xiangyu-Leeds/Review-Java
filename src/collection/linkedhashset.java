package collection;

import java.util.LinkedHashSet;

public class linkedhashset {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("张三");
        set.add("李四");
        set.add("王五");
        set.add("张三");

        System.out.println("元素个数：" + set.size());
        for (String name : set) {
            System.out.println(name);
        }


    }
}
