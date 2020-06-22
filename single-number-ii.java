// https://leetcode.com/problems/single-number-ii/
class Solution {
    // tc -> 32*n, sc-> 1
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int i=0; i<32; i++){
            int sum = 0;
            for(int num : nums)
                // counting 1 bit in numbers because 1 bit will be on same position if number is repeating
                if((num >> i & 1) == 1) 
                    sum++;
            sum %= 3;
            res |= sum<<i; // set the bit means making bit to 1 for the numbers do not occur three times
        }
        
        return res;
    }
}
