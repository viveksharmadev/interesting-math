// https://leetcode.com/problems/add-binary/
class add-binary {
    // tc -> m+n, sc-> Max(m,n)
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i=a.length()-1, j=b.length()-1, carry = 0;
        while(i>=0 || j>=0 || carry != 0){
            int x = i>=0 ? a.charAt(i)-'0' : 0;
            int y = j>=0 ? b.charAt(j)-'0' : 0;
            int sum = x + y + carry;
            carry = sum/2;
            res.insert(0,sum%2);
            i--; j--;
        }
        if(carry!=0) res.insert(0,carry);
        return res.toString();
    }
}
