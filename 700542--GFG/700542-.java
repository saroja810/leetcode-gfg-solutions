class Solution {
    public boolean formatArray(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);

        int mid = (n + 1) / 2;  
        int i = 0;             
        int j = mid;           

        while (i < (n / 2) && j < n) {
            if (arr[i] >= arr[j]) return false;
            i++;
            j++;
        }

        return true;
    }
}
