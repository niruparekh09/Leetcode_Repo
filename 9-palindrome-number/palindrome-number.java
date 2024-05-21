class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int reverseNum = 0, temp = x;
        while (temp != 0) {
            reverseNum = (10 * reverseNum) + (temp % 10);
            temp /= 10;
        }
        if (reverseNum == x)
            return true;
        else
            return false;
    }
}