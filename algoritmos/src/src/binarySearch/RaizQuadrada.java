package binarySearch;

public class RaizQuadrada {
    public int mySqrt(int x){
        if(x == 0){
            return 0;
        }
        
        int left = 0;
        int right = x;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mid == x/mid) {
                return x;
            }
            else if(mid < x/mid){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return right;
    }
}
