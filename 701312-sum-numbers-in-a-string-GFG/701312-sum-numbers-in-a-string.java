class Solution {
    public static int findSum(String str) {
        int ans = 0;
        for (int i = 0; i < str.length(); i++) { // int i = 0;
           //while(i < str.length())
           if (Character.isDigit(str.charAt(i))) {
               int sum = 0;
               while (i < str.length() && Character.isDigit(str.charAt(i))) {
                   sum = sum * 10 + (str.charAt(i) - '0');
                   i++;
               }
               ans += sum;
               i--;  // remove this
           }
        }
       return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna