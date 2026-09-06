class Solution {
    public long pairAndSum(int[] arr) {
        long ans = 0;
        for (int bit = 0; bit < 31; bit++) {
           long count = 0;
           for (int num : arr) {
               if ((num & (1 << bit)) != 0) {
                   count++;
               }
           }
           long pairs = count * (count - 1) / 2;
           ans += pairs * (1L << bit);
       }
       return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna