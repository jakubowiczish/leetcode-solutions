package _00056_merge_intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

    public static void main(String[] args) {
        int[][] intervals = {
                {1, 3},
                {2, 6},
                {8, 10},
                {15, 18}
        };

        System.out.println(Arrays.deepToString(merge(intervals)));

    }

    public static int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) return new int[0][0];

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        final List<int[]> res = new ArrayList<>();
        int[] prev = intervals[0];
        res.add(prev);

        for (int[] interval : intervals) {
            if (interval[0] <= prev[1]) {
                prev[1] = Math.max(interval[1], prev[1]); // modifying element already in the list
            } else {
                prev = interval;
                res.add(prev);
            }
        }

        return res.toArray(new int[0][]);
    }
}
