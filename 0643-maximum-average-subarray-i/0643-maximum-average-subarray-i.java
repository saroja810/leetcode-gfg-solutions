class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        int n = nums.length;
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }
        double maxAvg = sum/k;
        for(int i = 1; i <= n-k; i++){
            sum += nums[i+k-1];
            sum -= nums[i-1];
            double avg = sum/k;
            if(avg > maxAvg){
                maxAvg = avg;
            }
        }
        return maxAvg;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna