class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int [] nums2 = new int[n];
        for (int i = 0; i < n; i++) {
            nums2[(i+k)%n] = nums[i];
        }

        System.arraycopy(nums2, 0, nums, 0, n);
    }
}