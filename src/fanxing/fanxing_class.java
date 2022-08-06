package fanxing;

//public class MyArrayList<E>{    }
public class fanxing_class {
    //main
    public static void main(String[] args) {
        MyArrayLIst<String> list = new MyArrayLIst<>();
        //通过对泛型的设定，实现对数据专一处理
        list.add("石原里美");
        list.add("工藤静香");
        list.remove("工藤静香");

    }
}
//泛型类MyArrayLIst
 class MyArrayLIst<E> {
    public void add(E e){

    }
    public void remove(E e){

    }
}