package Arrays;

public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'j';
        System.out.println(nextGreatestLetter(letters, target));
    }

//   744. Smallest letter greater than target
static char nextGreatestLetter(char[] letters, char target) {

    int start = 0;
    int end = letters.length-1;

    while(start <= end){
        int mid = start + (end - start)/2;
        if((int)letters[mid] > (int)target){
            end = mid - 1;
        }else{
            start = mid + 1;
        }
    }
    return letters[start % letters.length];
}
}
