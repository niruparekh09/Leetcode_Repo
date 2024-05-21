
class Solution {
    public boolean isAnagram(String s, String t) {
        s = s.toLowerCase();
        t = t.toLowerCase();

        if (s.length() == t.length()) {
            char[] str1CharArray = s.toCharArray();
            char[] str2CharArray = t.toCharArray();

            Arrays.sort(str1CharArray);
            Arrays.sort(str2CharArray);

            boolean result = Arrays.equals(str1CharArray, str2CharArray);
            if (result)
                return true;
            else
                return false;
        } else {
            return false;
        }
    }
}