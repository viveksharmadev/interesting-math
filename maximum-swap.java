// https://leetcode.com/problems/maximum-swap/
class Solution {
    // tc -> n^2, sc-> n
    public int maximumSwap(int num) {
        StringBuilder sb = new StringBuilder();
        
        int curr = num;
        
        while(curr > 0){
            int mod = curr%10;
            
            sb.append(mod);
            
            curr /= 10;
        }
        
        String numStr = sb.reverse().toString();
        
        int maxNum = num;
                
        for(int i=0; i<numStr.length(); i++){
            
            for(int j=i+1; j<numStr.length(); j++){
                char c1 = numStr.charAt(i);
                char c2 = numStr.charAt(j);
                
                if(c1 < c2){        
                    
                    String newStr = swap(numStr, i, j);
                 
                    int newNum = Integer.parseInt(newStr);
                    
                    maxNum = Math.max(maxNum, newNum);
                }
        }
    }
        
        return maxNum;
    }
    
    private String swap(String str, int i, int j){
        StringBuilder sb = new StringBuilder(str);
        
        sb.setCharAt(i, str.charAt(j));
        sb.setCharAt(j, str.charAt(i));
        
        return sb.toString();
    }
}

// Using Integer.toString(num) to convert num to String

class Solution {
    // tc -> n^2, sc-> n
    public int maximumSwap(int num) {
        String numStr = Integer.toString(num);
        
        int maxNum = num;
                
        for(int i=0; i<numStr.length(); i++){
            
            for(int j=i+1; j<numStr.length(); j++){
                char c1 = numStr.charAt(i);
                char c2 = numStr.charAt(j);
                
                if(c1 < c2){        
                    
                    String newStr = swap(numStr, i, j);
                 
                    int newNum = Integer.parseInt(newStr);
                    
                    maxNum = Math.max(maxNum, newNum);
                }
        }
    }
        
        return maxNum;
    }
    
    private String swap(String str, int i, int j){
        StringBuilder sb = new StringBuilder(str);
        
        sb.setCharAt(i, str.charAt(j));
        sb.setCharAt(j, str.charAt(i));
        
        return sb.toString();
    }
}

class Solution {
    // tc -> n, sc-> n
    public int maximumSwap(int num) {             
        String numStr = Integer.toString(num);
        
        int[] indexMap = new int[10];
        
        for(int i=0; i<numStr.length(); i++){
            indexMap[numStr.charAt(i)-'0'] = i;
        }
        
        for(int i=0; i<numStr.length(); i++){
            
            for(int j=9; j>numStr.charAt(i)-'0'; j--){
                
                if(indexMap[j] > i){
                    
                    String newStr = swap(numStr, i, indexMap[j]);
                    
                    return getNumToStr(newStr);
                }
            }
        }
        
        return num;
    }
    
    private int getNumToStr(String str){
        return Integer.parseInt(str);
    }
    
    private String swap(String str, int i, int j){
        StringBuilder sb = new StringBuilder(str);
        
        sb.setCharAt(i, str.charAt(j));
        sb.setCharAt(j, str.charAt(i));
        
        return sb.toString();
    }
}
