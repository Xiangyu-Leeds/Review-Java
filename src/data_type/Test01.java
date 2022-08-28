package data_type;

public class Test01 {
    public static void main(String[] args) {
//        Integer a= 234;
//        Integer b=234; cache里面，不是new的
        Integer a =100;
        Integer b =100;
        System.out.println(a==b); //对象之间比较比较的是是否我同一对象（地址）
        System.out.println(a.equals(b)); //这个才是值大小
        String a0="abc";
        String b0="abc";
        //System.out.println(a0==b);
        System.out.println(a0.equals(b0));
    }
}
