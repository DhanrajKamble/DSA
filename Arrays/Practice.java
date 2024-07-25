package Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 9, 11, 12, 15, 20};
        int target = 1;
        System.out.println(ceilingNumber(arr, target));
        System.out.println(floorNumber(arr, target));
    }

//    Ceiling of a Number
    static int ceilingNumber(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target == arr[mid]){
                return arr[mid]; // ceiling is equal to target
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
//        next greater element
        if(start == arr.length)return -1;
        return arr[start];
    }

//    Floor of a Number
static int floorNumber(int[] arr, int target){
    int start = 0;
    int end = arr.length - 1;

    while(start <= end){
        int mid = start + (end - start) / 2;
        if(target == arr[mid]){
            return arr[mid]; // ceiling is equal to target
        }else if(target > arr[mid]){
            start = mid + 1;
        }else{
            end = mid - 1;
        }
    }
//        next smaller element
    if(end == -1) return -1;
    return arr[end];
}
}
