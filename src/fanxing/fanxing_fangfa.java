package fanxing;

// 定义方法的同时定义了泛型的方法就是泛型方法。
//泛型方法的格式：修饰符<泛型变量> 返回值类型 方法名（形参列表）{        }
//public <E> void view(E e){    }


import java.util.Arrays;

public class fanxing_fangfa {
    public static void main(String[] args) {
        String [] name = {"石原里美","工藤静香","朱茵"};
//        System.out.println(name);
        view(name);
        Integer [] age = {18,19,20};
        view(age);
        System.out.println(Arrays.toString(name));
//        int []a = {1,10,19};
//        StringBuilder l = new StringBuilder();
//        for (int m:a) {
//            l.append(m);
//        }
//        System.out.println(l);
//        String o =l.toString();

    }
    public static <T> void view(T[] arr){
        StringBuilder list = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            list.append(arr[i]).append("\t");
        }
        System.out.println(list);
    }


}
