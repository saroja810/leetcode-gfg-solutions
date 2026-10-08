import java.util.*;

class Solution {
    public int maxFrequency(int[] arr, int k) {
        Arrays.sort(arr);

        long sum = 0;
        int left = 0;
        int ans = 1;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while ((long) arr[right] * (right - left + 1) - sum > k) {
                sum -= arr[left];
                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna