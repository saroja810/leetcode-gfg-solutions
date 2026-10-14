class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (sum > 9L * num) return "";
        int q = sum / 9;
        int r = sum % 9;
        StringBuilder sb = new StringBuilder(num);
        for (int i = 0; i < q; i++) sb.append('9');
        if (r > 0) sb.append((char)('0' + r));
        for (int i = q + (r > 0 ? 1 : 0); i < num; i++) sb.append('0');
        return sb.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna