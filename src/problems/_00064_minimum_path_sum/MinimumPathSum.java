package _00064_minimum_path_sum;

public class MinimumPathSum {

    public static void main(String[] args) {
        int[][] grid = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}};

        System.out.println(minPathSum(grid));
    }

    public static int minPathSum(int[][] grid) {
        int height = grid.length;
        int width = grid[0].length;

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                if (row != 0 || col != 0) {
                    if (row == 0)
                        grid[row][col] = grid[row][col] + grid[row][col - 1];
                    else if (col == 0)
                        grid[row][col] = grid[row][col] + grid[row - 1][col];
                    else
                        grid[row][col] = grid[row][col]
                                + Math.min(grid[row][col - 1], grid[row - 1][col]);
                }
            }
        }

        return grid[height - 1][width - 1];
    }
}
