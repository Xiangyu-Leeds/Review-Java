package exception;

public class Test07 {
    public static void main(String[] args) {
        System.out.println(test(1));
    }
    private  static int test(int a){
        try {
            return a/0;
        }catch (Exception e){  //只有出现异常才会进入Exception
            return a;
        }finally {
            a=a+1;
        }
    }
}
