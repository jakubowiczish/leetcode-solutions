package _00442_find_duplicates_in_an_array;

import java.util.ArrayList;
import java.util.List;

public class DuplicatesInArrayFinder {

    // 1 <= a[i] <= n where n is size of array

    // when found number i, flip the number at position i-1 to negative.
    // if the number at position i-1 is already negative, i is the number that occurs twice.

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0)
                res.add(index + 1);
            nums[index] = -nums[index];
        }
        return res;
    }
}
