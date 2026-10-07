class Solution {
    public int countSubarrays(int[] arr, int k) {
        int n = arr.length;
        return solve(arr, k, n) - solve(arr, k-1, n);
    }
    static int solve(int[] arr, int k, int n){
        int i = 0, odds = 0, ans = 0;
        for(int j = 0; j < n; j++){
            if(arr[j] % 2 == 1){
                odds ++;
            }
            while(odds > k){
                if(arr[i] % 2 == 1){
                    odds --;
                }
                i++;
            }
            ans += (j-i+1);
        }
        return ans;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna