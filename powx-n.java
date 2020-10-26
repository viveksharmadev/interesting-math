// https://leetcode.com/problems/powx-n/

class Solution {
    // tc -> logn, sc-> 1
    public double myPow(double x, int n) {
        
        //long To handle -2147483648 where if you negate,
        // this will turn to positive that is out of range
        // that's why it will go to same min value again
        long N = n;
        
        if(N < 0){
            N = -N;
            x = 1/x;
        }
        
        double result = 1.0;
        double curr = x;
        
        for(; N>0; N/=2){
            if(N%2==1) result = result * curr;
                
            curr = curr * curr;
        }
        
        return result;
    }
}
