class Solution {
    int MOD = 1_000_000_007;
    public int palindromicStrings(int n, int k) {
        // code here
        long ans = 0, fact = k;
        for (int i = 0; i < n / 2; i++) {
            ans = (ans + fact) % MOD;
            fact = (fact * (k - i - 1)) % MOD;
        }
        if (n % 2 == 1) return (int) ((2 * ans + fact) % MOD);
        return (int) ((2 * ans) % MOD);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna