// https://leetcode.com/problems/string-to-integer-atoi/
class Solution {
    public int myAtoi(String str) {
        // tc - N, sc - 1
        double res = 0;
        int start=0;
        //discard white spaces
        str = str.trim();
        if(str==null || str.length()==0) return 0;
        //sign
        char sign = str.charAt(0);
        if(sign=='+' || sign=='-'){
            start++;
        }
        //res=34;
        //System.out.println(sign);
        //build number
        for(int i=start; i<str.length(); i++){
        // if space or special characters after first number then return
            if(!(str.charAt(i)-'0'>=0 && str.charAt(i)-'0'<=9)){
                return sign=='-' ? (int)(res*-1) : (int)res;
            }
            res = res*10 + str.charAt(i)-'0';
        }
        res = sign=='-' ? -res : res;
        //overflow and underflow
        if(res>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }else if(res < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return (int)res;
    }
}
