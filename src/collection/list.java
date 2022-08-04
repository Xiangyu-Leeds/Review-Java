package collection;

//在JavaSE中List名称的类型有两个，一个是java.util.List集合接口，一个是java.awt.List图形界面的组件，别导错包了。
import java.util.ArrayList;
import java.util.List;

//List系列集合特点：
//ArrayList、LinekdList：有序、有重复、有索引
//有序：存储和取出的元素顺序一致
//有索引：可以通过索引操作元素
//可重复：存储的元素可以重复
//List集合特有方法：
//List集合因为支持索引，所以多了很多索引操作的独特API，其他Collection的功能List也都继承了。
public class list {
    public static void main(String[] args) {
        // 创建List集合对象
        List<String> list = new ArrayList<String>();
        // 往 尾部添加 指定元素
        list.add("图图");
        list.add("小美");
        list.add("不高兴");

        System.out.println(list);
        // add(int index,String s) 往指定位置添加
        list.add(1,"没头脑");

        System.out.println(list);
        // String remove(int index) 删除指定位置元素  返回被删除元素
        // 删除索引位置为2的元素
        System.out.println("删除索引位置为2的元素");
        System.out.println(list.remove(2));

        System.out.println(list);

        // String set(int index,String s)
        // 在指定位置 进行 元素替代（改）
        // 修改指定位置元素
        list.set(0, "三毛");
        System.out.println(list);

        // String get(int index)  获取指定位置元素

        // 跟size() 方法一起用  来 遍历的
        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        //还可以使用增强for
        for (String string : list) {
            System.out.println(string);
        }
    }
}

