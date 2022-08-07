package 排序算法;

import java.util.Arrays;

public class choose {
    public static void main(String[] args) {
        int[] a ={9,8,4,5,2,3};
        for (int i = 0; i < a.length-1; i++) {
            int min=i;
            for (int j = i+1; j < a.length; j++) {
                if(a[j]<a[min])
                    min=j;
            }
            System.out.println("最小数为:"+a[min]);
            int temp =a[min];
            a[min]=a[i];
            a[i]=temp;
            System.out.println(Arrays.toString(a));
        }
    }

}
