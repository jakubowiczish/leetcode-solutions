package TwoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> resultMap = new HashMap<>();
        int rest, i;

        for (i = 0; i < nums.length; ++i) {
            rest = target - nums[i];

            if (resultMap.containsKey(rest)) {
                return new int[]{
                        resultMap.get(rest),
                        i
                };
            }

            resultMap.put(nums[i], i);
        }

        throw new IllegalArgumentException("THERE'S NO RESULT AVAILABLE");
    }
}
