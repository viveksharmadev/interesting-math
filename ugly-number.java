// https://leetcode.com/problems/ugly-number/
class ugly-number {
    // tc -> n, sc-> 1
    public boolean isUgly(int num) {
        if(num==0) return false;
        if(num==1) return true;
        
        int[] divisors = {2,3,5};
        
        for(int d : divisors){
            while(num%d==0){
                num /= d;
            }
        }
        
        return num==1;
    }
}
