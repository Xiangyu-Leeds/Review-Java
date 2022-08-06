package fanxing;

//泛型接口的格式：public interface People<E>{        }
//public interface People <E>{    }

public class fanxing_interface {
    public static void main(String[] args) {
        Fantype a = new Fantype();
        a.run(new Teacher());

    }
}
//People接口
 interface People <E>{
    void run(E e);
    void height(E e);
}
//Student类
 class Teacher {

}
//实现类Fantype
 class Fantype implements People<Teacher> {

    @Override
    public void run(Teacher teacher) {
        System.out.println(teacher+"会跑步");
    }

    @Override
    public void height(Teacher teacher) {

    }
}

