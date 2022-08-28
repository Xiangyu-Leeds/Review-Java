package file_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test07 {
    public static void main(String[] args) {
        File file = new File(".idea/");
        File target = new File("new/");
        target.mkdir();
        for (File f:
            file.listFiles() ) {
            try(FileInputStream inputStream = new FileInputStream(f);
                FileOutputStream outputStream = new FileOutputStream(target.getPath()+"/"+f.getName())) {
                byte [] bytes = new byte[20];
                int tmp;
                while ((tmp=inputStream.read(bytes))!=-1){
                    outputStream.write(bytes,0,tmp);
                }
                outputStream.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
