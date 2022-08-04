package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("石原里美",18);
        map.put("工藤静香",19);
        map.put("朱茵",20);
        map.put("石原里美",17);
        System.out.println(map);
        System.out.println(map.get("石原里美"));


//        由此可得出其顺序和添加的顺序有关系，并没有被打乱。
        Map<String,Integer> map1 = new LinkedHashMap<>();
        System.out.println(map1);



    }
}
