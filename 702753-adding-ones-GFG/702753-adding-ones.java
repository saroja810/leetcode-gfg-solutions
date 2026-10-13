import java.util.*;

class Solution {
    public ArrayList<Integer> update(int n, int[] updates) {
        int[] diff = new int[n + 1];

        for (int j : updates) {
            diff[j - 1]++;
        }

        ArrayList<Integer> arr = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            count += diff[i];
            arr.add(count);
        }

        return arr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna