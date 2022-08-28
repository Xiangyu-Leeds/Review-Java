package collection;

//List系列集合:添加的元素是有序、可重复、有索引
//ArrayList、LinekdList:有序、可重复、有索引
//Set系列集合:添加的元素是无序、不重复、无索引
//HashSet:无序、不重复、无索引
//LinkedHashSet:有序、不重复、无索引
//TreeSet:按照大小默认升序排序、不重复、无索引
import java.util.*;

public class collection {
    public static void main(String[] args) {
        // 创建集合对象
        // 使用多态形式
        Collection<String> coll = new ArrayList<String>();
        coll.toArray();
        // 使用方法
        // 添加功能  boolean  add(String s)
        coll.add("小李广");
        coll.add("扫地僧");
        coll.add("石破天");
        System.out.println(coll);
//        Iterator<String> it = coll.iterator();

        // boolean contains(E e) 判断o是否在集合中存在
        System.out.println("判断  扫地僧 是否在集合中"+coll.contains("扫地僧"));

        //boolean remove(E e) 删除在集合中的o元素
        System.out.println("删除石破天："+coll.remove("石破天"));
        System.out.println("操作之后集合中元素:"+coll);

        // size() 集合中有几个元素
        System.out.println("集合中有"+coll.size()+"个元素");

        // Object[] toArray()转换成一个Object数组
        Object[] objects = coll.toArray();
        // 遍历数组
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }

        // void  clear() 清空集合
        coll.clear();
        System.out.println("集合中内容为："+coll);
        // boolean  isEmpty()  判断是否为空
        System.out.println(coll.isEmpty());
        test2();
        test5();
    }
    public static void test2(){
        Collection coll = new ArrayList();
        coll.add(1);
        coll.add(2);

        System.out.println("coll集合元素的个数：" + coll.size());

        Collection other = new ArrayList();
        other.add(1);
        other.add(2);
        other.add(3);

//        coll.addAll(other);
		coll.add(other);
        System.out.println("coll集合元素的个数：" + coll.size());
    }

    public static void test5(){
        Collection coll = new ArrayList();
        coll.add(1);
        coll.add(2);
        coll.add(3);
        coll.add(4);
        coll.add(5);
        System.out.println("coll集合元素的个数：" + coll.size());//5

        Collection other = new ArrayList();
        other.add(1);
        other.add(2);
        other.add(8);

        coll.retainAll(other);//保留交集
        System.out.println("coll集合元素的个数：" + coll.size());//2
    }




}

