package exception;

public class Test05 {
    public static void main(String[] args) throws Exception {
        try {
            test(1,0);
        }catch (MyException e){
            e.printStackTrace();
        }


    }
    public static int test(int a, int b) throws MyException{ //编译时异常需要声明，运行可声明;
        if(b==0){
            throw new MyException("0");
        }
        return  a/b; //抛出异常会终止代码运行;
    }
}
