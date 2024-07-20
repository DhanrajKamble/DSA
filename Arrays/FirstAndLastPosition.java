package Arrays;
import java.util.*;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {9, 7, 0, 8, 7, 67, 40, 45};
        int target = 8;
        int[] ans = searchRange(nums, target);
        System.out.println(Arrays.toString(ans));
    }

//    34. Find First and Last Position of Element in Sorted Array
    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        int start = search(nums, target, true);
        ans[0] = start;

        if(ans[0] != -1){
        int end = search(nums, target, false);
            ans[1] = end;
        }
        return ans;
    }

    static int search(int[] nums, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length;-1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                ans = mid;
                if(findStartIndex){
                    end = mid-1;
                }else{
                    start = mid +1;
                }
            } else if (target < nums[mid]) {
                end = mid - 1;
            }else{
                start = mid +1;
            }
        }
        return ans;
    }

}
