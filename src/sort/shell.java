package sort;

import java.util.Arrays;

//希尔排序
public class shell {
    public static void main(String[] args) {
        int[] num = {7,6,9,3,1,5,2,4};
        System.out.println("未排序的数组："+ Arrays.toString(num));
        //增量序列的选择没有具体的公式，可以根据自己的数据取个合适的增量序列
        for (int increment = num.length/2; increment > 0 ; increment=increment/2) {
            //根据增量对数组进行分组
            for (int i = increment; i < num.length; i++) {
                int index = i;
                //进行插入排序
                //注意：index-increment值的变化
                while ((index-increment)>=0&&num[index]<num[index-increment]){
                    int temp = num[index];
                    num[index] = num[index-increment];
                    num[index-increment] = temp;
                    index =index-increment;
                }
            }
        }
        System.out.println("排序后的数组："+Arrays.toString(num));
    }
}

