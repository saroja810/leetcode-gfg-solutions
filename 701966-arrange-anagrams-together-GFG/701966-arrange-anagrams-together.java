class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
       HashMap<String, ArrayList<String>> hm = new HashMap<>();
       for(String word : arr){
           char[] ch = word.toCharArray();
           Arrays.sort(ch);
           String temp = new String(ch);
           if(!hm.containsKey(temp)){
               hm.put(temp, new ArrayList<>());
           }
           hm.get(temp).add(word);
       }
       return new ArrayList<>(hm.values());
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna