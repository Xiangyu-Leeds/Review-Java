package 排序算法;

import java.util.Arrays;

public class maopao {
    public static void main(String[] args) {
        int[] a ={8,4,2,5,9,3,9};
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j <a.length-1-i ; j++) {
                if (a[j+1]<=a[j]){
                    int temp = a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
            System.out.println(Arrays.toString(a));
        }
        System.out.println(Arrays.toString(a));
    }

}
