class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> hs = new HashSet<>();
        for(int x : nums){
            hs.add(x);
        }
        int prod = 1;
        int temp = k;
        while(!hs.add(temp)){
            prod++;
            temp = k * prod;
        }
        return temp;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna