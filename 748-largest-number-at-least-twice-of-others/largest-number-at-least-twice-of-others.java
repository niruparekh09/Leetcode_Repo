class Solution {
    public int dominantIndex(int[] nums) {
        int[] nums2 = nums.clone();
        Arrays.sort(nums);

        if (nums[nums.length - 1] >= (2 * nums[nums.length - 2]) || nums[nums.length - 2] == 0) {
            for (int i = 0; i < nums2.length; i++) {
                if (nums2[i] == nums[nums.length - 1]) {
                    return i;
                }
            }
        }
        return -1;
    }
}