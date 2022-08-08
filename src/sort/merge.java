package sort;

import java.util.Arrays;

public class merge {
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 1, 2, 9, 4, 7, 6};
        int[] temp = new int[arr.length];
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        System.out.println("排序前：" + Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1, temp);
        System.out.println("归并排序：" + Arrays.toString(arr));
    }

    /**
     * 归并排序算法
     *
     * @param arr        源数组
     * @param startIndex 起始坐标
     * @param endIndex   结束坐标
     * @param temp       临时数组
     */
    public static void mergeSort(int[] arr, int startIndex, int endIndex, int[] temp) {
        // 已经拆分到最小单位
        if (startIndex >= endIndex) return;
        // 拆分位置
        int mid = (startIndex + endIndex) / 2;
        // 递归拆分
        mergeSort(arr, startIndex, mid, temp);
        mergeSort(arr, mid + 1, endIndex, temp);
        // 合并
        merge(arr, startIndex, mid, endIndex, temp);
    }

    /**
     * 合并数组，两个数组分别为 arr[startIndex, mid]和arr[mid, endIndex]，操作源数组 arr[startIndex, endIndex]的数据
     *
     * @param arr        源数组
     * @param startIndex 起始坐标
     * @param mid        中间坐标
     * @param endIndex   结束坐标
     * @param temp       临时数组
     */
    public static void merge(int[] arr, int startIndex, int mid, int endIndex, int[] temp) {
        int left = startIndex;  // 左边数组的索引指针，用于遍历左数组
        int right = mid + 1;    // 右边数组的索引指针，用于遍历右数组
        int tempIndex = 0;      // 临时数组的索引指针，用于存储排序数据

        // 两边数组任意一边遍历完成时退出循环
        while (left <= mid && right <= endIndex) {
            if (arr[left] <= arr[right]) {
                // 左边数组更小或相等
                temp[tempIndex++] = arr[left++];
            } else {
                // 右边数组的值更小
                temp[tempIndex++] = arr[right++];
            }
        }

        // 左边读取完，右边没有读取完
        while (right <= endIndex) {
            temp[tempIndex++] = arr[right++];
        }

        // 右边读取完，左边没有读取完
        while (left <= mid) {
            temp[tempIndex++] = arr[left++];
        }

        // 将临时数组中的值填充到源数组中
        tempIndex = 0;
        while (startIndex <= endIndex) {
            arr[startIndex++] = temp[tempIndex++];
        }
    }


}
