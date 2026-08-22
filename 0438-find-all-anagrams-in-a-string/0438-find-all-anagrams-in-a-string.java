class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] freq = new int[26];
        List<Integer> res = new ArrayList<>();
        int n1 = s.length(), n2 = p.length();
        if(n1 < n2) return res;
        for(int i = 0; i < n2; i++){
            freq[p.charAt(i) - 'a']++;
        }
        int[] temp = new int[26];
        for(int i = 0; i < n2; i++){
            temp[s.charAt(i) - 'a'] ++;
        }
        int count = 0;
        for(int i = 0; i < 26; i++){
            if(freq[i] != temp[i]){
                break;
            }
            count ++;
        }
        if(count == 26){
            res.add(0);
        }
        for(int i = n2; i < n1; i++){
            count = 0;
            temp[s.charAt(i) - 'a'] ++;
            temp[s.charAt(i - n2) - 'a'] --;
            for(int j = 0; j < 26; j++){
                if(freq[j] != temp[j]){
                    break;
                }
                count++;
            }
            if(count == 26){
                res.add(i-n2+1);
            }
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna