class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = 1;
        for(int i=1; i<n; i++){
            left[i] = left[i-1] * nums[i-1];
        }
        int rightprod = 1;
        for(int i=n-1; i>=0; i--){
            left[i] = left[i] * rightprod;
            rightprod = rightprod * nums[i];
        }
        return left;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna