package transition_print;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Test03 {
    public static void main(String[] args) {
        try(PrintStream stream = new PrintStream(new FileOutputStream("output.txt"))){
            stream.println("lyh is sb");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
