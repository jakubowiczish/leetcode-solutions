package _00283_move_zeroes;

import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) return;

        int pos = 0;
        for (int x : nums) {
            if (x != 0)
                nums[pos++] = x;
        }

        for (int i = nums.length - 1; i >= pos; --i) {
            nums[i] = 0;
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int x = nums[i];
        nums[i] = nums[j];
        nums[j] = x;
    }
}
