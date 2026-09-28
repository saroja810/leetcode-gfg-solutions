class Solution {


    int[] segTree;

    public int GCD(int a , int b){
        if(a == 0){
            return b;
        }
        return GCD(b%a , a);
    }
    public void buildSegTree(int i , int l , int r , int[] arr){
        if(l == r){
            segTree[i] = arr[l];
            return;
        }
        int mid = l + (r - l)/ 2;
        buildSegTree(2*i + 1 , l , mid , arr);
        buildSegTree(2*i + 2 , mid+1 , r , arr);

        segTree[i] = GCD(segTree[2*i+1] , segTree[2*i+2]);
    }

    public void updateSegTree(int i , int l , int r , int value , int index){
        if(l == r){
            segTree[i] = value;
            return;
        }
        int mid = l + (r - l) / 2;
        if(index <= mid){
            updateSegTree(2*i + 1 , l , mid , value , index);
        }else{
            updateSegTree(2*i + 2 , mid + 1 , r , value , index);
        }
        segTree[i] = GCD(segTree[2*i+1] , segTree[2*i+2]);
    }

    public int segTreeQuery(int i , int l , int r , int start , int end){

        if(r < start || l > end){
            return 0;
        }
        if(l >= start && r <= end){
            return segTree[i];
        }
        int mid = l + (r - l)/ 2;
        return GCD(segTreeQuery(2*i+1 , l , mid , start ,end),
                   segTreeQuery(2*i+2 , mid+1 , r , start , end));

    }
    public ArrayList<Integer> processQueries(int[] arr, int[][] queries) {
        // code here
        int n = arr.length;

        segTree = new int[4 * n];
        buildSegTree(0 , 0 , n-1 , arr);

        ArrayList<Integer> queryResult = new ArrayList<>();

        for(int[] q : queries){
            int type = q[0];
            if(type == 0){
                int start = q[1];
                int end = q[2];
                int GCD = segTreeQuery(0 , 0 , n-1 ,  start , end);
                queryResult.add(GCD);
            }else{
                int index = q[1];
                int value = q[2];
                updateSegTree(0 , 0 , n-1 , value , index);
            }
        }
        return queryResult;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna