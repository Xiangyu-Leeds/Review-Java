package collection;


//HashSet：无序、不重复、无索引
//LinkedHashSet：有序、不重复、无索引
//TreeSet：排序、不重复、无索引
import java.util.HashSet;

public class hashset {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        HashSet<Employee> set = new HashSet<>();
        set.add(new Employee("张三", new MyDate(1990,1,1)));
        //重复元素无法添加，因为MyDate和Employee重写了hashCode和equals方法
        set.add(new Employee("张三", new MyDate(1990,1,1)));
        set.add(new Employee("李四", new MyDate(1992,2,2)));

        for (Employee object : set) {
            System.out.println(object);
        }
    }

}
 class Employee {
    private String name;
    private MyDate birthday;
    public Employee(String name, MyDate birthday) {
//        super();  默认存在调用父类
        this.name = name;
        this.birthday = birthday;
    }
    public Employee() {
//        super();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public MyDate getBirthday() {
        return birthday;
    }
    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((birthday == null) ? 0 : birthday.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (birthday == null) {
            if (other.birthday != null)
                return false;
        } else if (!birthday.equals(other.birthday))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "姓名：" + name + ", 生日：" + birthday;
    }
}

class MyDate {
    private int year;
    private int month;
    private int day;
    public MyDate(int year, int month, int day) {
        super();
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public MyDate() {
        super();
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + day;
        result = prime * result + month;
        result = prime * result + year;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MyDate other = (MyDate) obj;
        if (day != other.day)
            return false;
        if (month != other.month)
            return false;
        if (year != other.year)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}

