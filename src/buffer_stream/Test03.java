package buffer_stream;

import java.io.*;

public class Test03 {
    public static void main(String[] args) {
        try(BufferedReader reader =new BufferedReader(new FileReader("test2.txt"))) {
//            System.out.println(reader.readLine());  //按行读取
            reader
                    .lines()
                    .limit(1)
                    .sorted()
                    .forEach(System.out::println);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
