package arrays;

import java.util.Arrays;

public class Test02 {
    public static void main(String[] args) {
        int [][] array = {{1,5},{2,4},{7,3},{6}};
        int [][] array2 = {{1,5},{2,4},{7,3},{6}};
        System.out.println(Arrays.deepToString(array));
        System.out.println(Arrays.deepEquals(array2,array));
    }
}
