package file_stream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test05 {
    public static void main(String[] args) {
        try(FileReader reader = new FileReader("test2.txt");
            FileWriter writer = new FileWriter("output2.txt")) {
            char [] chars = new char[10];
            int tmp;
            while ((tmp = reader.read(chars))!=-1){
                writer.write(chars,0,tmp);
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
