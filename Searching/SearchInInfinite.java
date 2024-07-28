package Searching;

public class SearchInInfinite {

    public static void main(String[] args) {
        int [] arr = {1, 10, 15, 20, 40, 80, 90, 100, 120, 500, 510, 520, 530, 540, 550, 560, 570, 580, 590, 600, 610, 620, 630, 640, 650};
        int target = 50;

//        Extream elements code will not work
//        int target = 630;

        int ans = searchInfinite(arr, target);
        System.out.println(ans);
    }

//      Q. Search in Infinite sized Array works only for -->Extreamly left elements.
//      Or else we can make a data structure to store Length variable and by using the length variable we can do binary search (example like ArrayList)
    static int searchInfinite(int[] arr, int target){
        int start = 0;
        int end = 1;

        int ans = binarySearch(arr, target, start, end);
        if(ans == target){
            return ans;
        }else{
            while(start <= end){
                int tempStart = end + 1;
                end = end + (end - start + 1)*2;
                start = tempStart;
                int myAns = binarySearch(arr, target, start, end);
                if(myAns != -1 && arr[myAns] == target){
                    return myAns;
                }
                if(arr[myAns] > target)
                    return -1;
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end){

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target == arr[mid]){
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        if(arr[start] > target) return end;
        return -1;
    }
}
