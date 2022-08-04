package collection;

import java.util.ArrayList;
import java.util.Collection;

//for(元素的数据类型  变量 : Collection集合or数组){
//写操作代码
//    }
public class new_for {
    public static void main(String[] args) {
        int[] arr = {3,5,6,87};
        //使用增强for遍历数组
        for(int a : arr){//a代表数组中的每个元素
            System.out.println(a);
        }
        Collection<String> coll = new ArrayList<String>();  //也可以用arraylist，但是根据多态可用collection
        coll.add("小河神");
        coll.add("老河神");
        coll.add("神婆");
        //使用增强for遍历
        for(String s :coll){//接收变量s代表 代表被遍历到的集合元素
            System.out.println(s);
        }
    }
    //新for循环必须有被遍历的目标。目标只能是Collection等或者是数组。新式for仅仅作为遍历操作出现。
}


