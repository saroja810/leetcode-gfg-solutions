class Solution {
    public int countAlwaysFound(int[] arr) {
        // code here
        int n = arr.length;
        int[]leftmax = new int[n];
        int[] rightmin = new int[n];
        leftmax[0] = arr[0];
        for(int i=1;i<n;i++){
            leftmax[i] = Math.max(leftmax[i-1],arr[i]);
        }
        rightmin[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightmin[i] = Math.min(rightmin[i+1],arr[i]);
        }
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i]>=leftmax[i] && arr[i]<=rightmin[i]){
                count++;
            }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna