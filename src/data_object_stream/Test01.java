package data_object_stream;

import java.io.*;

public class Test01 {
    public static void main(String[] args) {
        try(DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("output.txt"));
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream("output.txt"))) {
//            dataOutputStream.writeBoolean(false);
            dataOutputStream.writeFloat(1.5F);
            System.out.println(dataInputStream.readBoolean());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
