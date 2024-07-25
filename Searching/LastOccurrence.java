package Searching;

public class LastOccurrence {
    public static void main(String[] args) {
        int[] arr = {20, 20, 20, 20, 20, 20};
        int target = 20;

        int ans = lastOccurrence(arr, target);
        System.out.println(ans);
    }

//    Q. Index of Last Occurrence in Sorted
    public static int lastOccurrence(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if (target == arr[mid]){
                    ans = mid;
                    start = mid + 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return ans;
    }
}
