package binary;

import java.util.ArrayList;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int []a = {1,2,5};
        System.out.println(Arrays.toString(a));
        ArrayList<Integer> s= new ArrayList<>();
        s.add(2);
        Object[] p = s.toArray();
        int q = (int) p[0];
        System.out.println(q);
    }
}
