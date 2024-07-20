package Arrays;

public class CeilingAndFloor {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 10;

        System.out.println("Ceiling of "+ target + " is " + ceilingNumber(arr, target));
        System.out.println("Floor of "+ target + " is " + floorNumber(arr, target));

    }

//Ceiling Of a Number
    static int ceilingNumber(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(end >= start){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return arr[mid];
            } else if (target > arr[mid]) {
                start = mid+1;
            }else{
                ans = arr[mid];
                end = mid-1;
            }
        }
        return ans;
    }

//    Floor of a number
    static int floorNumber(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return arr[mid];
            } else if (target > arr[mid]) {
                ans = arr[mid];
                start = mid +1;
            }else{
                end = mid - 1;
            }
        }
        return ans;
    }
}
