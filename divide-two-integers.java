https://leetcode.com/problems/divide-two-integers/
class Solution {
    // tc -> logn(where n is dividend), sc-> 1
    public int divide(int dividend, int divisor) {
        // Edge case
        if(dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        
        int sign = dividend < 0 ^ divisor < 0 ? -1 : 1;
        
        long divd = Math.abs((long)dividend);
        long divs = Math.abs((long)divisor);
        
        int result = 0;
        
        while(divs <= divd){
            
            long temp = divs, mult = 1;
            
            while(temp*2 <= divd){
                temp *= 2;
                mult *= 2;
            }
            
            result += mult;
            
            divd -= temp;
        }
        
        return sign * result;
    }
}

class Solution {
    // tc -> logn(where n is dividend), sc-> 1
    public int divide(int dividend, int divisor) {
        // Edge case
        if(dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        
        int sign = dividend < 0 ^ divisor < 0 ? -1 : 1;
        
        long divd = Math.abs((long)dividend);
        long divs = Math.abs((long)divisor);
        
        int result = 0;
        
        while(divs <= divd){
            
            long temp = divs, mult = 1;
            
            while(temp<<1 <= divd){
                temp <<= 1;
                mult <<= 1;
            }
            
            result += mult;
            
            divd -= temp;
        }
        
        return sign * result;
    }
}
