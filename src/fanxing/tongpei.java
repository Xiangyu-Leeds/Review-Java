package fanxing;

//？可以在“使用泛型”的时候代表一切类型
//E T K V是在定义泛型的时候用的

import java.util.ArrayList;

public class tongpei {
    public static void main(String[] args) {
        //main
//老师对象集合
        ArrayList<Teacher1> list1 = new ArrayList<>();
        list1.add(new Teacher1());
        list1.add(new Teacher1());
        pk(list1);
//学生对象集合
        ArrayList<Student1> list2 = new ArrayList<>();
        list2.add(new Student1());
        list2.add(new Student1());
        pk(list2);//由于pk方法的形参是泛型为Teacher的集合，所以会报错

//pk方法：

    }
//    public static void pk(ArrayList<Teacher> people){
//    }
//    上限：<? extends 父类>，传入类型必须是该父类或者是父类的子类
//    下限：<? super 子类>，传入类型必须是该子类或者是子类的父类
//public static void pk(ArrayList<? extends People> people){
////通过上下限便可以将这个问题解决掉
////要求传入的类型必须是People的子类才可以
//}



    public static void pk(ArrayList<?> people){
    //通过通配符?便可以将这个问题解决掉
    }


}
//父类
class People1{

}
//子类
class Teacher1 extends People1{

}
class Student1 extends People1{

}