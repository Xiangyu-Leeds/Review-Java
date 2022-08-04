package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class api {
    public static void main(String[] args) {
        Map<String ,Integer> maps = new HashMap<>();
        maps.put("石原里美",18);
        maps.put("工藤静香",19);
        maps.put("朱茵",20);
        maps.put("刘宇恒",22);
        maps.put("梓诺哥哥",18);
        System.out.println(maps);
        Set<String> key = maps.keySet();
        for (String k:key
        ) {
            System.out.println(maps.get(k));
        }
        Map<String ,Integer> maps1 = new HashMap<>();
        maps1.put("石原里美",18);
        maps1.put("工藤静香",19);
        maps1.put("朱茵",20);
        System.out.println(maps1);
        Set<Map.Entry<String, Integer>> set = maps1.entrySet();
        System.out.println(set);
        for (Map.Entry<String, Integer> s :
                set) {
            System.out.println(s.getKey()+"->"+s.getValue());
        }

    }
}
