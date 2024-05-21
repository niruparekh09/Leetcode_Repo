class Solution {
    public boolean isSameAfterReversals(int num) {
        int reverse = 0;
        int temp = num;
        while (temp != 0) {
            reverse = reverse * 10 + temp % 10;
            temp = temp / 10;
        }
        int doubleReverse = 0;
        temp = reverse;
        while (temp != 0) {
            doubleReverse = doubleReverse * 10 + temp % 10;
            temp = temp / 10;
        }
        if (doubleReverse == num) {
            return true;
        }

        return false;
    }
}