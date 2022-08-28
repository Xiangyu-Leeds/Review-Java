package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test02 {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        String str = null;
        String str = "A";
//        if(str!=null){
//            list.add(str);
//        }
        Optional<String> optional = Optional.ofNullable(str);  //转化为optional
//        optional.ifPresent(System.out::println);  //当存在时执行此方法
//        System.out.println(optional.orElse("lyh is sb"));
//        System.out.println(optional.filter(s -> s.equals("A")).get());
        System.out.println(optional.map(s->"null").get());



    }
}
