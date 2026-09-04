class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int suf[] = new int[n]; // suffix minimum array
        int min = Integer.MAX_VALUE;
        for(int i = n-1; i >= 0; i--){
            min = Math.min(min, nums[i]);
            suf[i] = min;
        }
        int max = 0;
        for(int i = 0; i < n; i++){
            max = Math.max(max, nums[i]);
            int diff = max - suf[i];
            if(diff <= k){
                return i; // first index only
            }
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna