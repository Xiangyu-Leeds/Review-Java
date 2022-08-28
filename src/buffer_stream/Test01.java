package buffer_stream;

import javax.imageio.IIOException;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) {
        try(BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("test.txt"),1)) {
//            System.out.println((char) bufferedInputStream.read());  //操作和原来的流是一样的
            bufferedInputStream.mark(1);  //只保留之后的一个字符
            System.out.println((char) bufferedInputStream.read());
            System.out.println((char) bufferedInputStream.read());

            bufferedInputStream.reset();  //返回mark时的位置
            System.out.println((char) bufferedInputStream.read());
            System.out.println((char) bufferedInputStream.read());



        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
