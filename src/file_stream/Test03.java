package file_stream;

import java.io.FileReader;
import java.io.IOException;

public class Test03 {
    public static void main(String[] args) {
        try(FileReader reader = new FileReader("test2.txt")){
//            reader.skip(1); //现在跳过的是一个字符
//            System.out.println((char) reader.read());  //按字符进行读取，可以直接中文读取字符
            char [] str = new char[10];
            reader.read(str);
            System.out.println(str);  //自动读取到char[]中;

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
