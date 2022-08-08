package sort;


import java.util.Arrays;

public class count {
    public static void main(String[] args) {
        int[] array = { 4, 2, 2, 8, 3, 3, 1 };
        // Find the maximum element in the input array
        int max = findMaxElement(array);
        System.out.println("Max Value in input array-" + max);
        System.out.println("Original Array- " + Arrays.toString(array));
        int[] sortedArr = countingSort(array, max + 1);
        System.out.println("Sorted array after counting sort- " + Arrays.toString(sortedArr));
    }

    private static int findMaxElement(int[] array) {
        int max = array[0];
        for (int val : array) {
            if (val > max)
                max = val;
        }
        return max;
    }

    private static int[] countingSort(int[] array, int range) {
        int[] output = new int[array.length];
        int[] count = new int[range];
        // Calculate frequency of each element, put it in count array
        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }
        System.out.println("Count array- " + Arrays.toString(count));

        // Modify count array to get the final position of elements
        for (int i = 1; i < range; i++) {
            count[i] = count[i] + count[i - 1];
        }
        System.out.println("Modified count array- " + Arrays.toString(count));

        // Add elements to output sorted array
        for (int i = 0; i < array.length; i++) {
            output[count[array[i]] - 1] = array[i];
            count[array[i]]--;
        }
        return output;
    }
}

