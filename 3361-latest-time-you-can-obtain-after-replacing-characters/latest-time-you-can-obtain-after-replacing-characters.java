class Solution {
    public String findLatestTime(String s) {
    StringBuilder sb = new StringBuilder(s);
    for (int i = 0; i < sb.length(); i++) {
        if (sb.charAt(i) == '?') {
            if (i == 0) {
                // If the first digit is '?', set it to '2' if the next digit is less than '4', else '1'
                if(sb.charAt(i+1) != '?')
                sb.setCharAt(i, (sb.charAt(i + 1) < '2') ? '1' : '0');
                else
                    sb.setCharAt(i,'1');
            } else if (i == 1) {
                // If the second digit is '?', set it to '3' if the first digit is '2', else '9'
                sb.setCharAt(i, (sb.charAt(0) == '1') ? '1' : '9');
            } else if (i == 3) {
                sb.setCharAt(i, '5');
            } else if (i == 4) {
                sb.setCharAt(i, '9');
            }
        }
    }
    return sb.toString();
    }

}