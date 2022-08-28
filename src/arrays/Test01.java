package arrays;

import lambda.A;

import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) {
        int [] array = {1,5,4,3,7};
        Arrays.sort(array);
        System.out.println(array);  //数组没有重写toString；
        System.out.println(Arrays.toString(array));
        System.out.println("目标元素3的位置为:"+Arrays.binarySearch(array,3)); //二分搜索;
        Arrays
                .stream(array)
                .sorted()
                .forEach(System.out::println); //Array的流操作;
        int []array2 = Arrays.copyOf(array,array.length);
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.equals(array,array2));
        Arrays.fill(array,0); //将数组所有元素填充为指定值;
        System.out.println(Arrays.toString(array));
        Arrays.setAll(array2,i->array2[i]+2);  //依次计算每一个元素（i是下标位置）
        System.out.println(Arrays.toString(array2));
    }
}
