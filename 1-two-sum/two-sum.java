class Solution {
    public int[] twoSum(int[] nums, int target) {
       int op[] = new int[2];

        for (int i = 0; i<nums.length-1;i++){
            for (int j = i+1; j<nums.length;j++){
                if (nums[i] + nums[j] == target){
                   op[0] = i;
                   op[1] = j;
                }
            }
        }
        return op;
    }
}