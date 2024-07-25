package Searching;
import Searching.FirstOccurrencs;
import Searching.LastOccurrence;

public class CountOccurrence {
    public static void main(String[] args) {
        int[] arr = {10, 10, 50, 100, 110};
        int target = 10;
        System.out.println(  countOccurrence(arr, target));
    }

    static int countOccurrence(int[] arr, int target){
        int first = FirstOccurrencs.firstOccurrence(arr, target);
        if(first == -1)
            return 0;

        else
            return (LastOccurrence.lastOccurrence(arr, target) - first + 1);

    }
}
