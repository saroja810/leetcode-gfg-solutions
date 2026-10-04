class Solution {
    public ArrayList<String> generateParentheses(int n) {
       ArrayList<String> result = new ArrayList<>();
       generate("", 0, 0, n/2, result);
       return result;
    }
    public void generate(String curr, int open, int close, int n, List<String> result){
        if(open == n && close == n){
            result.add(curr);
            return;
        }
        if(open < n){
            generate(curr+"(", open+1, close, n, result);
        }
        if(close < open){
            generate(curr+")", open, close+1, n, result);
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna