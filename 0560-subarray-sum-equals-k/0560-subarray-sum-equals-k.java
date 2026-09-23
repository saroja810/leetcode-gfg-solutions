class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0, count = 0;
        hm.put(0, 1);
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(hm.containsKey(sum - k)){
                count += hm.get(sum-k);
            }
            hm.put(sum, hm.getOrDefault(sum, 0)+1);
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna