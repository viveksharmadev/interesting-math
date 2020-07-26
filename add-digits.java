// https://leetcode.com/problems/add-digits/
class add-digits {
    // tc -> n, sc-> 1
    public int addDigits(int num) {
        int sum = 0;
        while(num > 0){
            sum += num%10;
            num = num/10;
            if(sum>9 && num==0){
                num = sum;
                sum = 0;
            }
        }
        return sum;
    }
    
     // tc -> 1, sc-> 1
    public int addDigits(int num) {
        return num<10 ? num : (num%9==0 ? 9 : num%9);
        
    }
}
