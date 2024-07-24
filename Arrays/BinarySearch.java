package Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 7, 8, 10, 11, 12, 15, 20, 23, 30};
        int target = 15;
        System.out.println(BinarySearch(arr, target));
    }

    static int BinarySearch(int[] arr, int target){
        int s = 0;
        int e = arr.length-1;

        while(s <= e){
            int m = s + (e - s)/2;
            if(target == arr[m]){
//                If found return index
                return m;
            } else if (target > arr[m]) {
                s = m + 1;
            }else{
                e = m - 1;
            }
        }
//        element not found
        return -1;
    }
}
