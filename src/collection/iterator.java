package collection;

//Iterator主要用于迭代访问（即遍历）Collection中的元素，因此Iterator对象也被称为迭代器。

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class iterator {
    public static void main(String[] args) {
        // 使用多态方式 创建对象
        Collection<String> coll = new ArrayList<String>();

        // 添加元素到集合
        coll.add("串串星人");
        coll.add("吐槽星人");
        coll.add("汪星人");
        //遍历
        //使用迭代器 遍历   每个集合对象都有自己的迭代器
        Iterator<String> it = coll.iterator();
        //  泛型指的是 迭代出 元素的数据类型
        while(it.hasNext()){ //判断是否有迭代元素
            String s = it.next();//获取迭代出的元素
            System.out.println(s);
        }
        System.out.println(coll);
        test02();
    }
    public static void test02(){
        Collection<String> coll = new ArrayList<>();
        coll.add("陈琦");
        coll.add("李晨");
        coll.add("邓超");
        coll.add("黄晓明");

        //删除名字有三个字的
//		coll.remove(o)//无法编写


        Iterator<String> iterator = coll.iterator();
        while(iterator.hasNext()){
            String element = iterator.next();
            if(element.length()==3){
//				coll.remove(element);//错误的
                iterator.remove();
            }
        }
        System.out.println(coll);
    }

}

