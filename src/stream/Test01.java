package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        //stream操作
        list = list  //链式调用
                .stream()  //获取流
                .distinct()  //去重
                .sorted((a,b)-> b - a) //排序
                .map(e -> e+1)
                .limit(2)

//                .filter(e->!e.equals("B"))  //只允许不是B的元素通过流水线


                .collect(Collectors.toList());  //重新收集起来变回list
        System.out.println(list);
    }
}
