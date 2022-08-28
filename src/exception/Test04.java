package exception;

public class Test04 {
    public static void main(String[] args) throws Exception {
            test(1,0);
        System.out.println("lyh is sb");

    }
    public static int test(int a, int b) throws Exception{ //编译时异常需要声明，运行可声明;
        if(b==0){
            throw new Exception("0不能做除数");
        }
        return  a/b; //抛出异常会终止代码运行;
    }
}
