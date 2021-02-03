package _00054_spiral_matrix;

import java.util.LinkedList;
import java.util.List;

public class SpiralMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        System.out.println(spiralOrder(matrix));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        final List<Integer> res = new LinkedList<>();

        if (matrix == null || matrix.length == 0) return res;

        int n = matrix.length;
        int m = matrix[0].length;
        int size = n * m;

        int up = 0, down = n - 1;
        int left = 0, right = m - 1;

        while (res.size() < size) {

            for (int i = left; i <= right && res.size() < size; i++)
                res.add(matrix[up][i]);

            for (int i = up + 1; i <= down - 1 && res.size() < size; i++)
                res.add(matrix[i][right]);

            for (int i = right; i >= left && res.size() < size; i--)
                res.add(matrix[down][i]);

            for (int i = down - 1; i >= up + 1 && res.size() < size; i--)
                res.add(matrix[i][left]);

            ++up;
            --down;
            ++left;
            --right;
        }

        return res;
    }
}
