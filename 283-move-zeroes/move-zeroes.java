class Solution {
    public void moveZeroes(int[] nums) {
        int snowBallSize = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                snowBallSize++;
            } else if (snowBallSize > 0) {// only when we have found 1 zero then proceed here
                int temp = nums[i]; // storing non zero value in temp
                nums[i] = 0; // putting value 0 in place of i
                nums[i - snowBallSize] = temp;
                // when 1 zero in 0,1,0,3,12 => it will switch 0 and 1. after 2nd 0
                // snowballsize=2, when enocunter 3 in 1,0,0,3,12. it will put 3 in 3(i) -
                // 2(size) in 1st index. new array 1,3,0,0,12.
            }
        }
    }
}