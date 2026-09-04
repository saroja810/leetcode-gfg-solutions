class Solution {
    public int maxFruits(ArrayList<Integer> arr, int m) {
        // code here
        int n =arr.size();
        if(n==0 || m<=0)
            return 0;

        if(m>=n){
            int tot=0;
            for(int x:arr)
                tot += x;
            return tot;
        }
        
        int windowsum=0;
        for(int i=0;i<m;i++){
            windowsum+=arr.get(i);
        }
        
        int maxsum=windowsum;
        for(int i=1;i<n;i++){
            windowsum+=arr.get((i+m-1)%n);
            windowsum-=arr.get(i-1);
            maxsum=Math.max(maxsum,windowsum);
        }
        
        return maxsum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna