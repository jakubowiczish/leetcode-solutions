package _00217_contains_duplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean containsDuplicateSet(int[] nums) {
        Set<Integer> setOfNumbers = new HashSet<>();

        for (int num : nums) {
            if (setOfNumbers.contains(num)) return true;
            setOfNumbers.add(num);
        }

        return false;
    }

    public boolean containsDuplicateInPlace(int [] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i - 1] == nums[i])
                return true;
        }
        return false;
    }

    public boolean containsDuplicateNaive(int[] nums) {
        for (int i = 0; i < nums.length; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                if (nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }


}
