class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0, prod = 1;
        int x = n;
        while(x > 0){
            int r = x % 10;
            sum += r;
            prod *= r;
            x /= 10;
        }
        int res = sum + prod;
        if((n % res) == 0){
            return true;
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna