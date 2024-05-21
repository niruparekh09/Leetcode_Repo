class Solution {
    public int trap(int[] height) {
        int n = height.length;
        // Calculate left max boundary
        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        // Initializing leftMax auxilary array
        for (int i = 1; i < n; i++) {
            // Comparing current height with height of previous(left) max boundary
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        // Calculate left max boundary
        int[] rightMax = new int[n];
        rightMax[n - 1] = height[n - 1];
        // Initializing rightMax auxilary array
        for (int i = n - 2; i >= 0; i--) {
            // Comparing current height with height of next(right) max boundary
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        // loop
        int trappedRainWater = 0;
        for (int i = 0; i < n; i++) {
            // Water level = min(lmb,rmb)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            // Trapped Water = WL-Height[i]
            trappedRainWater += waterLevel - height[i];
        }

        return trappedRainWater;
    }
}