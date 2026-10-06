class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0)+1);
        }
        ArrayList<Character> al = new ArrayList<>(hm.keySet());
        Collections.sort(al, (a,b)->hm.get(b)-hm.get(a));
        String res = "";
        for(char ch : al){
            int n = hm.get(ch);
            while(n-- > 0){
                res += ch;
            }
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna