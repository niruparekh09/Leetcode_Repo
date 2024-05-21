class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer integer : nums1) {
            set.add(integer);
        }

        HashSet<Integer> al = new HashSet<>();
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i]))
                al.add(nums2[i]);
        }

        // Convert HashSet to array
        int[] retArr = new int[al.size()];
        int index = 0;
        for (int num : al) {
            retArr[index++] = num;
        }

        return retArr;
    }
}