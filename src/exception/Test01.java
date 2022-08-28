package exception;

//明确异常和错误的区别
public class Test01 {
    public static void main(String[] args) {
        try {
            test(1,0);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(113);

    }
    public static int test(int a, int b) throws Exception{ //编译时异常需要声明，运行可声明;
        if(b==0){
            throw new Exception("0不能做除数");
        }
        return  a/b; //抛出异常会终止代码运行;
    }
}
