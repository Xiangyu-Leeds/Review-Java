package data_type;

public class Test02 {
    public static void main(String[] args) {
        Integer l1= 2873;
        Integer l2 = 2873;
        Integer l3 =100;
        int c = Integer.max(l1,l3);
        System.out.println(l1+1==l2+1);
        //参与基本数据类型的运算，会被拆箱操作 l1.intValue

        String o ="123";
        int w = Integer.parseInt(o);
        System.out.println(w);
    }
}
