public class CountOnes {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 1};
        int target = 1;

        int count = countOnes(arr, target);
        System.out.println(count);
    }
    
//    Q. Count Ones in a sorted Binary Array
    static int countOnes(int[] arr, int target){
        int first = firstOcc(arr, target);
        if(first == -1)
            return 0;
        else
//            return size of ones in array
            return (lastOcc(arr, target)-first+1);
    }

//    finding first occurrence
    static int firstOcc(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target == arr[mid]){
                ans = mid;
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else{
                end = mid - 1;
            }

        }
//        return index of first occurrence
        return ans;
    }

//      finding first occurrence
    static int lastOcc(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target == arr[mid]){
                ans = mid;
                start = mid + 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else{
                end = mid - 1;
            }

        }
//        return index of last occurrence
        return ans;
    }
}
