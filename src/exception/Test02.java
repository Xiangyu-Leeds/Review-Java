package exception;

import java.io.IOException;

public class Test02 {
    public static void main(String[] args) {
        int []arr =new int[5];
        try {
            arr[5]=1;
        }catch (ArrayIndexOutOfBoundsException e){ //运行时异常
            e.printStackTrace();
            System.out.println("出现异常");

        }
        //IOException  //编译时异常必须处理，否则程序报错
        System.out.println("sxy");


    }
}
