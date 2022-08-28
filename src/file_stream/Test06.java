package file_stream;

import java.io.File;

public class Test06 {
    public static void main(String[] args) {
        File file = new File("test.txt");
        System.out.println(file.exists()); //此文件是否存在;
        System.out.println(file.length());
        System.out.println(file.isDirectory());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.canExecute());
    }
}
