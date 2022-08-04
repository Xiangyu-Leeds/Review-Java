package map;

import java.util.Map;
import java.util.TreeMap;

public class treemap {
    public static void main(String[] args) {
        Map<Integer,String > Students = new TreeMap<>();
        Students.put(13,"乔治");
        Students.put(11,"欧文");
        Students.put(23,"乔丹");
        Students.put(22,"阿尔瓦多");
        Students.put(23,"詹姆斯");
        System.out.println(Students);

        //通过对上述代码和实验结果的观察，我们可以得知其性质：默认对键进行排序（从小到大），遇到重复的键，后者的值会将前者覆盖，而且同样是不可以使用索引的。
//        Map<Employer,String > employer = new TreeMap<>();
        Map<Employer,String > employer = new TreeMap<>((o1,  o2)-> o2.getSalary()-o1.getSalary());

        employer.put(new Employer("张三",1000),"Java程序员");
        employer.put(new Employer("李四",10000),"python程序员");
        employer.put(new Employer("王五",3000),"清洁工");
        System.out.println(employer);
//实验结果：



        }
}

class Employer {
    private String name;
    private int salary;
    Employer(String name,int salary){
        this.name=name;
        this.salary=salary;
    }
//    @Override
//    public int compareTo(Employer o) {
//        return o.getSalary() - this.getSalary();
//    }

    public int getSalary() {
        return salary;
    }
    @Override
    public String toString(){
        return "Employer [name=" + name + ", salary=" + salary + "]";
    }

}
//其他代码就不在此过多赘述，仅展示有用的代码。


