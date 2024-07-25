package Searching;

public class FirstOccurrencs {
    public static void main(String[] args) {
        int[] arr = {10, 10, 10, 10, 10, 10, 10};
        int target = 10;

        int ans = firstOccurrence(arr, target);
        System.out.println(ans);
    }

//    Q. Index of first occurrence in Sorted
    static int firstOccurrence(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        int ans = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
//            if target found then again search in left side of array
            if(target == arr[mid]){
                ans = mid;
                end = mid -1;
            }
//            find target if not found in right side part of array
            else if (target > arr[mid]) {
                start = mid + 1;
            }
//            find target if not found in left side part of array
            else{
                end = mid - 1;
            }
        }
        return ans;
    }
}
