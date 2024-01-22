class Solution {
    public int mySqrt(int x) {
        int start = 1;
        int end = x;
        if(x<2){
            return x;
        }
        while(start<end){
            int mid = (start+end)/2;
            if(mid*mid==x){
                return mid;
            }
            if(mid*mid>x){
                end = mid;
            }
            else{
                start = mid+1;
            }
        
        }
        return start-1;
    }
}
