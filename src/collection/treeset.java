package collection;

import java.util.Comparator;
import java.util.TreeSet;

//1、不允许重复
//2、实现排序
//自然排序或定制排序
//方式一：自然排序
//让待添加的元素类型实现Comparable接口，并重写compareTo方法
//
//方式二：定制排序
//创建Set对象时，指定Comparator比较器接口，并实现compare方法
public class treeset {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("zhangsan");  //String它实现了java.lang.Comparable接口
        set.add("lisi");
        set.add("wangwu");
        set.add("zhangsan");

        System.out.println("元素个数：" + set.size());
        for (String str : set) {
            System.out.println(str);
        }

        TreeSet<Student> set1 = new TreeSet(new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getId() - o2.getId();
            }

        });
        set1.add(new Student(3,"张三"));
        set1.add(new Student(1,"李四"));
        set1.add(new Student(2,"王五"));
        set1.add(new Student(3,"张三风"));

        System.out.println("元素个数：" + set1.size());
        for (Student stu : set1) {
            System.out.println(stu);
        }

    }
}
 class Student{
    private int id;
    private String name;
    public Student(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    //......这里省略了name属性的get/set
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }
}

