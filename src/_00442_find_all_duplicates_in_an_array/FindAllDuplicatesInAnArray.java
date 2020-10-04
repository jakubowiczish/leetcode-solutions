package _00442_find_all_duplicates_in_an_array;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInAnArray {

    // when found a number i, set the number at a position i-1 to negative.
    // if the number at position i-1 is already negative, i is the number that occurs twice.

    public List<Integer> findDuplicates(int[] nums) {
        final List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;

            if (nums[index] < 0) result.add(Math.abs(index + 1));
            nums[index] = -nums[index];
        }

        return result;
    }
}
