class Solution {
    public int maximumPrimeDifference(int[] nums) {
        
        int maxDistance = 0;
        int minPrimeIdx = Integer.MAX_VALUE;
        int maxPrimeIdx = Integer.MIN_VALUE;
        
        // Iterate through the array to find prime numbers and their indices
        for (int i = 0; i < nums.length; i++) {
            if (isPrime(nums[i])) {
                minPrimeIdx = Math.min(minPrimeIdx, i);
                maxPrimeIdx = Math.max(maxPrimeIdx, i);
                maxDistance = Math.max(maxDistance, maxPrimeIdx - minPrimeIdx);
            }
        }
        
        return maxDistance;
    }
    
    // Function to check if a number is prime
    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}