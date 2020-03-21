package _00118_pascals_triangle;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();

            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    list.add(1);
                } else {
                    int first = result.get(i - 1).get(j - 1);
                    int second = result.get(i - 1).get(j);
                    list.add(first + second);
                }
            }

            result.add(list);
        }

        return result;
    }
}
