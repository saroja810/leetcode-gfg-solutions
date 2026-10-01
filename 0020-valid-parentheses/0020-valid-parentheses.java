class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '{' || ch == '[' || ch == '('){
                st.push(ch);
            }else{
                if(st.isEmpty()) return false;
                char top = st.pop();
                if(ch != ']' && top == '[' || 
                   ch != '}' && top == '{' || 
                   ch != ')' && top == '('  ){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna