class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0, max = 0, zeroCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                counter++;
            }
            if (nums[i] == 0) {
                if(max<counter)
                max = counter;
                counter = 0;
                zeroCount++;
            }
            if(max<counter)
                max = counter;
        }
        if (zeroCount == nums.length) {
            return 0;
        }
        return max;
    }
}