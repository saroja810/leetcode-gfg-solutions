class Solution {
    public void mergeTwoParts(int[] arr) {
        // code here
        int n = arr.length;
        mergeSort(arr, 0, n - 1);
    }

    private void mergeSort(int[] arr, int low, int high) {
        if(low >= high) return;
        int mid = low + (high - low) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    private void merge(int[] arr, int low, int mid, int high) {
       int left = low;
       int right = mid + 1;
       List<Integer> list = new ArrayList<>();

       while (left <= mid && right <= high) {
           if (arr[left] <= arr[right]) {
               list.add(arr[left++]);
           } else {
               list.add(arr[right++]);
           }
       }

       while (left <= mid) {
           list.add(arr[left++]);
       }

       while (right <= high) {
           list.add(arr[right++]);
       }

       for (int i = low; i <= high; i++) {
           arr[i] = list.get(i - low);
       }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna