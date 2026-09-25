class Solution {
    public List<String> braceExpansionII(String expression) {
        
		//Map to store indices of open and close brackets
        Map<Integer, Integer> bracePairs = new HashMap<>();
        
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        
		//Populating the map with bracket pairs
        while (index < expression.length()) {
            
            if (expression.charAt(index) == '{') {
                stack.push(index);
            } else if (expression.charAt(index) == '}') {
                bracePairs.put(stack.pop(), index);
            }
            
            index++;
        }
        
        List<String> res = new ArrayList<>(solve(expression, 0, expression.length() - 1, bracePairs));
        Collections.sort(res);
        return res;
    }
    
    public Set<String> solve(String expression, int start, int end, Map<Integer, Integer> bracePairs) {
        
        
        Set<String> finalSet = new HashSet<>();
        Set<String> res = new HashSet<>();

        while (start <= end) {
            
			//If we find a opening bracket, we just make a recursive call to evaluate the expression inside the brackets.
            if (expression.charAt(start) == '{') {
                res = multiplyTwoSets(res, solve(expression, start + 1, bracePairs.get(start) - 1, bracePairs));
                start = bracePairs.get(start) + 1; //Set start to position immediately after the closing bracket
				
			//If we find a comma, we can add result to final set
            } else if (expression.charAt(start) == ',') {
                finalSet.addAll(res);
                res = new HashSet<>();
                start++;
				
			//Read until comma or open bracket is encounterd
            } else {
                int s = start;
                while (s <= end && expression.charAt(s) >= 'a' && expression.charAt(s) <= 'z') s++;
                Set<String> temp = new HashSet<>();
                temp.add(expression.substring(start, s));
                res = multiplyTwoSets(res, temp);
                start = s;
            }
        }
        
		//The last result has to be added separately as the condition for comma does not get called for the last result
        finalSet.addAll(res);
        
        return finalSet;
    }
    
	//Helper method to multiply two sets. ["a", "b"] x ["c", "d"] will give ["ac", "ad", "bc", "bd"]
    public Set<String> multiplyTwoSets(Set<String> a, Set<String> b) {
        
		//In case one if empty, return another for simplicity
        if (a.isEmpty()) return b;
        if (b.isEmpty()) return a;
        
        Set<String> res = new HashSet<>();
        
        for (String e1: a) {
            for (String e2: b) {
                res.add(e1 + e2);
            }
        }
        
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna