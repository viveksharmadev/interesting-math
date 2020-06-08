// https://leetcode.com/problems/power-of-two/

class power-of-two {
  // tc -> n, sc-> 1
  public boolean isPowerOfTwo(int n) {
        if(n==0) return false;
        while(n%2==0){
            n=n/2;
        }
        return n==1;
    }
  
    // tc -> 1, sc-> 1
    public boolean isPowerOfTwo(int n) {
        if(n==0) return false;
        long x = (long) n;
        return (x & (x-1)) == 0;
    }
}
