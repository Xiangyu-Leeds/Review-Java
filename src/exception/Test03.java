package exception;

public class Test03 {
    public static void main(String[] args) {
        try {
            int []arr = new int[Integer.MAX_VALUE];
        }catch (Throwable e){  //Throwable是最大的父类
            System.out.println("捕获到异常");
//            e.printStackTrace();
            //错误也可以捕获，但是不建议
        }
        System.out.println(1121);
    }
}
