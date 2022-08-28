package arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test03 {
    public static void main(String[] args) {
        Integer[] array = {1,4,6,2,3};
        List<Integer> list = Arrays.asList(array);  //不支持基本类型数组，必须是对象类型数组;
        Arrays.asList("A","B","C");//也可以逐个添加，因为是可变参数;

       // list.add(1); //此list的长度是固定的，是Arrays内部单独实现的一个类型，但是不支持添加操作;
       // list.remove(2);  //同理不支持;
        list.set(0,8);
        list.sort(Comparator.reverseOrder());
        System.out.println(list);

        List<Integer> list1 = new ArrayList<>(Arrays.asList(array));  //真正意义的ArrayList;


    }
}
