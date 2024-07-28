package Searching;

public class RotatedArray {

    public static void main(String[] args) {
        int[] arr = {13, 20, 30, 40, 50, 8, 9, 10, 11, 12};
        int target = 20;

        int peakElement = linearSearch(arr);
//        System.out.println(peakElement);

        if(peakElement+1 != arr.length){
            int ans = binarySearch(arr, target,peakElement + 1, arr.length-1);
            if(ans == -1){
                 ans = binarySearch(arr, target,0, peakElement);
            }
            System.out.println(ans);
        }

    }
//    Q. Search in Sorted Rotated Array

//    Brute Force:
//    Peak: Iterating 0 to n-1, if found return else return -1
//      TC: O(n)
    static int linearSearch(int[] arr){
        int ans = -1;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if(ans < arr[i]){
                ans = arr[i];
                index = i;
            }
        }
        return index;
    }
//    Binary Search
    static int binarySearch(int []arr, int target, int start, int end){

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target == arr[mid])
                return mid;
            else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }

 
}
