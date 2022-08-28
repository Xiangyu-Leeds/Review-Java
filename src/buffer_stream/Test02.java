package buffer_stream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class Test02 {
    public static void main(String[] args) throws IOException {
        try(BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("output3.txt"))) {
            outputStream.write("wsd".getBytes());
            outputStream.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
