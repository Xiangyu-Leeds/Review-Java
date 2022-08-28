package file_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test02 {
    public static void main(String[] args) {
        try(FileOutputStream outputStream = new FileOutputStream("output.txt")){
//            outputStream.write('a');
//            outputStream.write("lyh".getBytes());  //字符串转化为byte
//            outputStream.flush(); //建议最后一次刷新操作（强制写入）来保证数据正确写入到硬盘文件中
            FileInputStream inputStream = new FileInputStream("test.txt");
            byte [] bytes = new byte[10];  //长度为10作为传输媒介
            int tmp;  //存储本地读取字节数
            System.out.println(inputStream.read(bytes));
            while ((tmp = inputStream.read(bytes))!=-1){
                outputStream.write(bytes,0,tmp);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
