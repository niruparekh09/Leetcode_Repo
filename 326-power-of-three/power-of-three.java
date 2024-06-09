class Solution {
    public boolean isPowerOfThree(int n) {
        if (n < 1)
            return false;
        if (n == 1)
            return true;
        int num = n;
        while (num > 0) {
            if (num % 3 == 0) {
                num /= 3;
                if (num == 1) {
                    return true;
                }
            } else if (num % 3 > 0) {
                return false;
            }
        }
        return false;

    }
}