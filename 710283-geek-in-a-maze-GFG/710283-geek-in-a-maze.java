import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class Solution {
    private static class Cell {
        int r, c;
        Cell(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }

    public int numberOfCells(int r, int c, int u, int d, char[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        // Base case: starting cell is an obstacle or invalid
        if (r < 0 || r >= n || c < 0 || c >= m || mat[r][c] == '#') {
            return 0;
        }

        // Stores minimum upward moves required to reach each cell
        int[][] minUp = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(minUp[i], Integer.MAX_VALUE);
        }

        Deque<Cell> deque = new ArrayDeque<>();
        minUp[r][c] = 0;
        deque.addFirst(new Cell(r, c));

        // Direction vectors: UP, DOWN, LEFT, RIGHT
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!deque.isEmpty()) {
            Cell curr = deque.pollFirst();
            int cr = curr.r;
            int cc = curr.c;

            for (int i = 0; i < 4; i++) {
                int nr = cr + dr[i];
                int nc = cc + dc[i];

                // Bounds and obstacle check
                if (nr >= 0 && nr < n && nc >= 0 && nc < m && mat[nr][nc] != '#') {
                    int weight = (dr[i] == -1) ? 1 : 0;
                    int nextUp = minUp[cr][cc] + weight;
                    int nextDown = nextUp + nr - r;

                    // Prune paths that exceed move limits or aren't optimal
                    if (nextUp <= u && nextDown <= d && nextUp < minUp[nr][nc]) {
                        minUp[nr][nc] = nextUp;
                        if (weight == 1) {
                            deque.addLast(new Cell(nr, nc));  // Higher cost move to back
                        } else {
                            deque.addFirst(new Cell(nr, nc)); // Zero cost move to front
                        }
                    }
                }
            }
        }

        // Count all reachable cells
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (minUp[i][j] != Integer.MAX_VALUE) {
                    count++;
                }
            }
        }

        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna