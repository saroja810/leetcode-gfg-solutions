class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int i = 0; 
        int ones = 0;
        String ans = "";
        for(int j = 0; j < s.length(); j++){

            if(s.charAt(j) == '1'){
                ones++;
            }

            while(ones > k){
                if(s.charAt(i) == '1'){
                    ones --;
                }
                i++;
            }
            if(ones == k){
                while(i < j && s.charAt(i) == '0'){
                    i++;
                }
                String curr = s.substring(i, j+1);
                if(ans.isEmpty() || 
                    curr.length() < ans.length() ||
                    (curr.length() == ans.length() && curr.compareTo(ans) < 0)){
                    ans = curr;
                }
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna