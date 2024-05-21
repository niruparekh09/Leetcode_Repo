class Solution {
    public static int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        res[0] = search(nums, target, true);
        res[1] = search(nums, target, false);
        return res;
    }

    public static int search(int[] nums, int target, boolean isStartPosition) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
    
        while(start <= end){
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                ans = mid;
                if (isStartPosition) end = mid - 1;
                else start = mid + 1;
            } else if (nums[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        return ans;
    }
}