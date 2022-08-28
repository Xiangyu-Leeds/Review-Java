package file_stream;

import java.io.FileWriter;
import java.io.IOException;

public class Test04 {
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("output2.txt")) {
//            System.out.println(writer.getEncoding());  //支持编码格式
            writer.write("牛");
            writer
                    .append("牛");
            writer.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
