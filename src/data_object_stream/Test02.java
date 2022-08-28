package data_object_stream;

import java.io.*;

public class Test02 {
    public static void main(String[] args) {
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("output.txt"));
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("output.txt"))) {
            People people = new People("lyh");
            outputStream.writeObject(people);
            outputStream.flush();
            people = (People) inputStream.readObject();
            System.out.println(people.name);
        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    static class People implements Serializable{  //
        private static final long serialVersionUID = 123456; //在序列化时，会自动添加这个属性，它代表当前类对版本，我们也可以手动指定版本
        transient String name; //代表这个属性这个不保存

//        int age;
        public People(String name){
            this.name = name;
        }
    }
}
