class Solution {
    public List<String> summaryRanges(int[] nums) {
          List<String> list = new ArrayList<>();
        int start = 0;
        int ptr = 0;
        if (nums.length == 1) {
            String str = String.valueOf(nums[0]);
            list.add(str);
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == (nums[i - 1] + 1)) {
                if (ptr == 0) {
                    start = nums[i - 1];
                }
                ptr++;
            } else {
                if (ptr == 0) {
                    String str = String.valueOf(nums[i - 1]);
                    list.add(str);
                } else {
                    String str = String.valueOf(start) + "->" + String.valueOf(nums[i - 1]);
                    list.add(str);
                    ptr = 0;
                }
            }

            if (i == nums.length - 1 && ptr != 0) {
                String str = String.valueOf(start) + "->" + String.valueOf(nums[i]);
                list.add(str);
            }

            if (i == nums.length - 1 && ptr == 0) {
                String str = String.valueOf(nums[i]);
                list.add(str);
            }
        }
        return list;
    }
}