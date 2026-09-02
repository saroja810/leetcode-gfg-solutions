class Solution {
    public int solve(int n, String s) {
        // code here
        int[] freq = new int[26];
        int count = 0, res = 0;
        for(int i = 0; i < s.length(); i++){
            int idx = s.charAt(i)-'A';
            if(freq[idx] == 0){
                if(count < n){
                    freq[idx] = 1;
                    count ++;
                }else{
                    freq[idx] = 2;
                    res ++;
                }
            }else{
                if(freq[idx] == 1)
                    count --;
                freq[idx] = 0;
            }
        }
        return res;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna