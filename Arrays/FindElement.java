package Arrays;

import java.util.ArrayList;

public class FindElement {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(18);
        arr.add(12);
        arr.add(9);
        arr.add(14);
        arr.add(77);
        arr.add(50);

        System.out.println(arr);

        int ans = findElement(arr, 14);
        System.out.println(ans);
    }

    static int findElement(ArrayList<Integer> arr, int target){
        if(arr.size() == 0) return -1;
        int i = 0;
        while(i < arr.size()){
            if(arr.get(i) == target){
                return i;
            }
            i++;
        }
        return -1;
    }
}
