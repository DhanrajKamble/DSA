package Arrays;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {15, 12, 10, 7, 5, 3, 2};
        int target = 2;

        System.out.println(orderAgnosticBS(arr, target));
    }

//    OrderAgnostic Binary Search
    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        boolean isAscending = arr[0] < arr[arr.length-1];

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target == arr[mid]){
                return mid;
            }
//            Ascending Binary Search
            if(isAscending){
                if(target > arr[mid]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
//            Descending Binary Search
            else{
                if(target > arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
//        If element not Found
        return -1;
    }
}
