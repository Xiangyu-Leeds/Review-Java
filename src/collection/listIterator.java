package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class listIterator {
    public static void main(String[] args) {
        ArrayList<Student> c = new ArrayList<>();
        c.add(new Student(1,"张三"));
        c.add(new Student(2,"李四"));
        c.add(new Student(3,"王五"));
        c.add(new Student(4,"赵六"));
        c.add(new Student(5,"钱七"));

        //从指定位置往前遍历
        ListIterator<Student> listIterator = c.listIterator();
        while(listIterator.hasNext()){
            Student previous = listIterator.next();
            System.out.println(listIterator.nextIndex());
            System.out.println(previous);
        }
    }
   static class Student{
        private int id;
        private String name;
        Student(int id, String name){
            this.id=id;
            this.name =name;
        }

       @Override
       public String toString() {
           return "Student{" +
                   "id=" + id +
                   ", name='" + name + '\'' +
                   '}';
       }
   }


}
