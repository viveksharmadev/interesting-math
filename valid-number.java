// https://leetcode.com/problems/valid-number/
class Solution {
    // tc -> n, sc-> 1
    public boolean isNumber(String s) {
        s = s.trim();
        
        boolean numberSeen = false;
        boolean pointSeen = false;
        boolean eSeen = false;        
        
        for(int i=0; i<s.length(); i++){            
            char c = s.charAt(i);
            
            // Numbers from 0 to 9           
            if(c >= '0' && c <= '9'){
                numberSeen = true;
            }
            
            // . can not come after . and e
            else if(c == '.'){
                if(eSeen || pointSeen) return false;
                
                pointSeen = true;
            }
            
            // e can not come after e and can only come after a number
            else if(c == 'e'){
                if(eSeen || !numberSeen) return false;
                
                numberSeen = false;
                eSeen = true;
            }    
            
            // + or - can only come in begining and after e
            else if(c=='+' || c=='-'){
                if(i!=0 && s.charAt(i-1) != 'e') return false;                
            }
            
            //  any other chaaracter will break the validation
            else{
                return false;
            }        
        }
        
        return numberSeen;
    }
}
