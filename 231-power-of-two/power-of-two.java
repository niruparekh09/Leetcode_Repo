class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n == 1)
            return true;
        int num = n;
        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
                if (num == 1) {
                    return true;
                }
            } else if (num % 2 > 0) {
                return false;
            }
        }
        return false;
    }
}