package search;

public class half {


    public static void main(String[] args) {
        int []nums = {1,3,4,5,8,10};
        int result = search(nums, 10);
    }
    public static int search(int[] nums, int target) {
        int start = 0, end = nums.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(target<nums[mid]){
                end=mid-1;
            }else if(target>nums[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
