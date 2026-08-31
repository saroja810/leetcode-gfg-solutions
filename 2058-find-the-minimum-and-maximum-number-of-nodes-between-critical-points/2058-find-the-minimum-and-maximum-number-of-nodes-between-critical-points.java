/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] res = new int[2];
        int min = Integer.MAX_VALUE;
        int i = 1, first = 0, last = 0;
        ListNode prev = head, curr = head.next, nxt = head.next.next;
        while(nxt != null){
            if((curr.val < prev.val && curr.val < nxt.val) ||
                (curr.val > prev.val && curr.val > nxt.val) ){
                    if(first == 0){
                        first = i;
                    }else{
                        min = Math.min(min, i-last);
                    }
                    last = i;
            }
            prev = curr;
            curr = nxt;
            nxt = nxt.next;
            i++;
        }
        return first == last ? new int[]{-1, -1} : new int[]{min, last - first};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna