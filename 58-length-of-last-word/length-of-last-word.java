class Solution {
    public int lengthOfLastWord(String sb) {
        StringBuilder s = new StringBuilder(sb);
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                s.deleteCharAt(i);
            } else {
                break;
            }
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                break;
            } else {
                count++;
            }
        }
        return count;
    }
}