// https://leetcode.com/problems/strobogrammatic-number/
class Solution {
    // tc -> n, sc-> 1
    public boolean isStrobogrammatic(String num) {
        Map<Character, Character> map = new HashMap<>();
        
        map.put('0', '0');
        map.put('1', '1');
        map.put('6', '9');
        map.put('9', '6');
        map.put('8', '8');
        
        int start = 0, end = num.length()-1;
        
        while(start <= end){
            
            if(num.charAt(start++) 
               != map.getOrDefault(num.charAt(end--), ' ')){
                return false;
            }
        }
        
        return true;
    }
}

// Without map
class Solution {
    // tc -> n, sc-> 1
    public boolean isStrobogrammatic(String num) {
        char[] map = {'0','1','c','c','c','c','9','c','8','6'};
        
        int start = 0, end = num.length()-1;
        
        while(start <= end){
            
            if(map[num.charAt(start++)-'0'] != num.charAt(end--)){
                return false;
            }
        }
        
        return true;
    }
}
