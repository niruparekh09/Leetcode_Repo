class Solution {
    public int search(int[] arr, int key) {
        return rec_search(arr, 0, arr.length - 1, key);
    }

    public int rec_search(int[] arr, int start, int end, int target) {
        if (start > end) {
            return -1;
        }
        int m = start + (end - start) / 2;
        if (arr[m] == target) {
            return m;
        }
        if (arr[m] > target) {
            return rec_search(arr, start, m - 1, target);
        }
        return rec_search(arr, m + 1, end, target);
    }
}