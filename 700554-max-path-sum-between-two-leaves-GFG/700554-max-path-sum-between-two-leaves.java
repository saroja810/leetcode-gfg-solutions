/* Node Structure

class Node

{

    int data;

    Node left, right;



    Node(int item)

    {

        data = item;

        left = right = null;

    }

} */

//class Solution {

    //public int maxPathSum(Node root) {

        // code here

      class Solution {

    int find(Node root, int[] sum) {

        // Base case: if null, return 0 (won't be reached by leaf nodes due to explicit checks)

        if (root == null) return 0; 



        // Base case: Leaf node. A leaf node returns its own data as the starting path.

        if (root.left == null && root.right == null) {

            return root.data;

        }



        // Recursively find the max leaf-to-node path sum for left and right subtrees

        int lSum = find(root.left, sum);

        int rSum = find(root.right, sum);



        // Condition: The current node has BOTH children. 

        // It can form a complete path from a leaf in the left subtree to a leaf in the right subtree.

        if (root.left != null && root.right != null) {

            sum[0] = Math.max(sum[0], root.data + lSum + rSum);

            return root.data + Math.max(lSum, rSum);

        }



        // Condition: The current node has only ONE child.

        // It cannot bridge a leaf-to-leaf path itself, so it just extends the valid path upward.

        return (root.left == null) ? root.data + rSum : root.data + lSum;

    }



    public int maxPathSum(Node root) { 

        int[] sum = {Integer.MIN_VALUE};

        int ans = find(root, sum);



        // Special Edge Case: If the root itself has only one child, but a valid 

        // leaf-to-leaf path exists entirely within that single subtree, sum[0] will be updated.

        // If sum[0] remains MIN_VALUE, it means no valid 2-leaf path exists in the entire tree.

        return sum[0]==Integer.MIN_VALUE? -1:sum[0];

    } 

}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna