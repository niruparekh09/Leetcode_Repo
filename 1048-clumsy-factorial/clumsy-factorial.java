class Solution {
    public int clumsy(int n) {
        int cfact = n;
        int result = 0;
        int counter = 0;
        n--;

        while (n > 0) {
            if (counter == 0) {
                cfact *= n;
                counter++;
            } else if (counter == 1) {
                cfact /= n;
                counter++;
            } else if (counter == 2) {
                cfact += n;
                counter++;
            } else if (counter == 3) {
                result += cfact;  // store the current result before subtracting
                cfact = -n;       // start a new section with subtraction
                counter = 0;      // reset the counter for the next section
            }
            n--;
        }
        result += cfact;  
        return result;
    }
}