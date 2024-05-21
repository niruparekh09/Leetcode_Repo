class Solution {
    public boolean isPowerOfFour(int n) {
        if (n == 1)
            return true;
        int num = n;
        while (num > 0) {
            if (num % 4 == 0) {
                num /= 4;
                if (num == 1) {
                    return true;
                }
            } else if(num%4 >0){
                return false;
            }
        }
        return false;
    }
}