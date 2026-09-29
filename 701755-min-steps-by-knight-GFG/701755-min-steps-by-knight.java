import java.util.*;

class Solution {
    public int minStepToReachTarget(int knightPos[], int targetPos[], int n) {

        // If source and target are the same
        if (knightPos[0] == targetPos[0] &&
            knightPos[1] == targetPos[1]) {
            return 0;
        }

        // 8 possible knight moves
        int[][] moves = {
            {2, 1},
            {2, -1},
            {-2, 1},
            {-2, -1},
            {1, 2},
            {1, -2},
            {-1, 2},
            {-1, -2}
        };

        // Visited array
        boolean[][] visited = new boolean[n + 1][n + 1];

        // Queue stores: {row, column, number of moves}
        Queue<int[]> queue = new LinkedList<>();

        int startX = knightPos[0];
        int startY = knightPos[1];

        queue.offer(new int[]{startX, startY, 0});
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();

            int x = current[0];
            int y = current[1];
            int steps = current[2];

            // Try all 8 possible moves
            for (int[] move : moves) {
                int newX = x + move[0];
                int newY = y + move[1];

                // Check whether the new position is inside the board
                if (newX >= 1 && newX <= n &&
                    newY >= 1 && newY <= n &&
                    !visited[newX][newY]) {

                    // Target reached
                    if (newX == targetPos[0] &&
                        newY == targetPos[1]) {
                        return steps + 1;
                    }

                    visited[newX][newY] = true;
                    queue.offer(new int[]{newX, newY, steps + 1});
                }
            }
        }

        // Target cannot be reached
        return -1;
    }
}



// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna