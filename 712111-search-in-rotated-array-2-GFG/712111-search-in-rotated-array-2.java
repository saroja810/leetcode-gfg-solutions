class Solution {
    public boolean search(int[] nums, int key) {
        int low = 0, high = nums.length - 1;
        while(low <= high){
            int mid = low + (high-low) / 2;
            if(key == nums[mid]){
                return true;
            }
            // Cannot determine which half is sorted
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high--;
            }
            else if(nums[low] <= nums[mid]){ // sorted array
                if(key >= nums[low] && key < nums[mid]){
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }else{
                if(key > nums[mid] && key <= nums[high]){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }
        }
        return false;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna