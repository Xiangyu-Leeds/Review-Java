package data_type;

public class Test {
    public static void main(String[] args) {
        Integer i =1;  //自动装箱和拆箱机制
//        Integer i = Integer.valueOf(1)
        //如果在-128-127之间，缓存直接取出来，否则新创建
        System.out.println(i+1);
        double b =i;
        int a =i; //i.intValue();(拆箱）
        System.out.println(a);
        System.out.println(b);
    }
}
