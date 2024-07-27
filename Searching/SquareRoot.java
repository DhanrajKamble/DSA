package Searching;

public class SquareRoot {
    public static void main(String[] args) {
        int x = 4;
        int ans = squareRoot(90);

        System.out.println(ans);

    }

//    Brute Force Approach: -----> TC: Osquare root(n) ----> SC: O(1)
    static int squareRoot(int x){
        int ans = -1;
        int i = 2;
        if( x == 0)
            return 0;
        else if (x == 1 || x == 2 || x == 3) {
            return 1;
        }

        while(i * i <= x){
            if(i * i <= x)
                ans = i;
            if(i * i > x)
                break;
//            increament i++
            i++;
        }
        return ans;
    }
//      Optimised my solution
    public int mySqrt(int x) {
        if(x == 0) return 0;
        if(x == 1 || x == 2 || x == 3) return 1;


        long start = 2;
        long end = x/2;

        long ans = -1;

        while(start <= end){
            long mid = (start + (end - start) / 2);

            if(mid * mid == (long)x){
                return (int)mid;
            }else if(mid * mid < (long)x){
                ans = mid;
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }
        return (int)ans;
    }
}
