package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class lambda {
    public static void main(String[] args) {
        //之前学习的匿名内部类
        Collection<String> list = new ArrayList<>();
        list.add("s");
        list.add("b");
        list.forEach(new Consumer<String>(){
            @Override
            public void accept(String s){
                System.out.println(s);
            }
        });
//简化为Lambda表达式
        list.forEach(s->{
            System.out.println(s);
        });
//或者更加简化：
        list.forEach(s -> System.out.println(s));
//输出结果(沿用前面的list)：


    }
}
