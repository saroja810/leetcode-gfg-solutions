class Solution {
    public int maxProduct(int[] arr, int k) {
        // code here
        Integer[][][]dp= new Integer[arr.length][k+1][];

        return f(arr.length-1,k-1,arr,dp)[1];
    }

    public Integer[] f(int i, int j, int[] arr, Integer[][][]dp){
        if(dp[i][j]!=null) return dp[i][j];
        if(i==j){
            int ans=1;
            int k=i;
            while(k>=0) ans*=arr[k--];
            return dp[i][j]=new Integer[]{ans,ans};
        }
        if(j==0){
            int k=i;
            int ansMin=arr[k];
            int ansMax=arr[k];
            while(k>=0){
                ansMin=Math.min(arr[k],ansMin);
                ansMax=Math.max(arr[k],ansMax);
                k--;
            }
            return dp[i][j]=new Integer[]{ansMin,ansMax};
        }

        Integer[] notPick=f(i-1,j,arr,dp);
        Integer[] t=f(i-1,j-1,arr,dp);
        int max=Math.max( arr[i]*t[0],arr[i]*t[1]);
        int ansMax=Math.max(notPick[1],max);
        int min=Math.min(arr[i]*t[0],arr[i]*t[1]);
        int ansMin=Math.min(notPick[0],min);
        return dp[i][j]= new Integer[]{ansMin,ansMax};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna