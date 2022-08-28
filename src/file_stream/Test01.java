package file_stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) {
        try(FileInputStream inputStream = new FileInputStream("test.txt")) {  //这种方法不需要关闭
//            int tmp;
//            while ((tmp= inputStream.read())!=-1){
//                System.out.println((char) tmp);
//            }
//            System.out.println(inputStream.available()); //剩余字节数

            byte[] bytes = new byte[inputStream.available()];
            System.out.println(inputStream.available());
            System.out.println(inputStream.read(bytes));  //一次性读取全部内容
//            System.out.println(inputStream.read(bytes,0,3));
            System.out.println(Arrays.toString(bytes));
            System.out.println(new String(bytes));  //得到字符串
//            System.out.println(inputStream.read());
//            System.out.println((char) 98);
//            System.out.println(inputStream.skip(1));
//            System.out.println((char) inputStream.read());


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
