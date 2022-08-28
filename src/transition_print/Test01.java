package transition_print;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Test01 {
    public static void main(String[] args) {
        try(OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("output4.txt"))){
            writer.write("dsgdewf");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
