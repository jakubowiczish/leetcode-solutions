package _00167_two_sum_2_input_array_is_sorted;

import java.util.Arrays;

public class TwoSumArraySorted {

    public static void main(String[] args) {
        int[] numbers = new int[]{2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(numbers, 9)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] indices = new int[2];
        if (numbers == null || numbers.length < 2) return indices;

        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int x = numbers[left] + numbers[right];
            if (x == target) {
                indices[0] = left + 1;
                indices[1] = right + 1;
                break;
            } else if (x < target)
                ++left;
            else --right;
        }

        return indices;
    }
}
