// https://leetcode.com/problems/add-to-array-form-of-integer/
class Solution {
    // tc -> n, sc-> n
    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> result = new LinkedList<>();
        
        int n = A.length;
        
        int i=n-1;
        
        int carry = 0;
        
        while(i>=0 || K>0 || carry!=0){
            int a = i>=0 ? A[i--] : 0;
            int b = K>0 ? K%10 : 0;
            
            K /= 10;
            
            int sum = a + b + carry;
            
            carry = sum/10;
            
            result.add(0, sum%10);
            
            sum /= 10;
        }
        
        return result;
    }
}
