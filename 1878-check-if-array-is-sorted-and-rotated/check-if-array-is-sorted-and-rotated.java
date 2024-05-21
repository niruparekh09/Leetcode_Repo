class Solution {
    public  boolean check(int[] nums) {
        int pivotIdx = findPivot(nums);
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = pivotIdx + 1; i < nums.length; i++) {
            al.add(nums[i]);
        }
        for (int i = 0; i <= pivotIdx; i++) {
            al.add(nums[i]);
        }

        // Create a sorted copy of nums
        int[] sortedNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortedNums);

        // Create ArrayList from sortedNums
        ArrayList<Integer> al2 = Arrays.stream(sortedNums)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));

        // Check if al is a rotation of al2
        for (int i = 0; i < al2.size(); i++) {
            boolean isRotation = true;
            for (int j = 0; j < al2.size(); j++) {
                if (!al2.get(j).equals(al.get((i + j) % al2.size()))) {
                    isRotation = false;
                    break;
                }
            }
            if (isRotation) return true;
        }
        return false;
    }

    public  int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}