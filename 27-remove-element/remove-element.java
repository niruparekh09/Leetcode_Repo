class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                al.add(nums[i]);
            }
        }
        
        for (int i = 0; i < nums.length; i++) {
            if(i == al.size()){
                break;
            }
            nums[i] = al.get(i);
        }

        return al.size();
    }
}