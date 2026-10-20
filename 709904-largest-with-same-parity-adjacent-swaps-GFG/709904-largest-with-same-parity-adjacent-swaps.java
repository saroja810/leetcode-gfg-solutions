class Solution {
    public ArrayList<Integer> lexicographicallyLargest(int[] arr) {
        // code here
       int n = arr.length;
       ArrayList<Integer> ans = new ArrayList<>();

       for (int i=0; i<n;) {
           ArrayList<Integer> temp = new ArrayList<>();
           temp.add(arr[i]);

           while (++i < n) {
               if (arr[i-1]%2 == arr[i]%2)
                   temp.add(arr[i]);
               else
                   break;
           }

           Collections.sort(temp, Collections.reverseOrder());
           ans.addAll(temp);
       }

       return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna