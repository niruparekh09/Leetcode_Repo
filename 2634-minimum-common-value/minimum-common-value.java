class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> hs1 = new HashSet<>();
        for (int i : nums1)
            hs1.add(i);
        for (int i = 0; i < nums2.length; i++) {
            if (hs1.contains(nums2[i]))
                return nums2[i];
        }
        return -1;
    }
}