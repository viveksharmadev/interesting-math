// https://leetcode.com/problems/multiply-strings/
class Solution {
    // tc -> m*n, sc-> m+n
    public String multiply(String num1, String num2) {
        int len1 = num1.length(), len2 = num2.length();
        
        int[] products = new int[len1+len2];
        
        for(int i=len1-1; i>=0; i--){
            for(int j=len2-1; j>=0; j--){
                int d1 = num1.charAt(i)-'0';
                int d2 = num2.charAt(j)-'0';
                
                products[i+j+1] += d1*d2;        
            }
        }
        
        int carry = 0;
        
        for(int i=products.length-1; i>=0; i--){
            int sum = products[i] + carry;
            products[i] = sum%10;
            carry = sum/10;
        }
        
        StringBuilder result = new StringBuilder();
        
        for(int p : products) result.append(p);
        
        while(result.length()!=0 && result.charAt(0)=='0') 
            result.deleteCharAt(0);
        
        return result.length()!=0 ? result.toString() : "0";
    }
}
