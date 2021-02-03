package _00905_sort_array_by_parity;

import java.util.Arrays;

public class SortArrayByParity {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 7, 4, 6};
        System.out.println(Arrays.toString(sortArrayByParity(arr)));
    }

    public static int[] sortArrayByParity(int[] A) {
        int left = 0;
        int right = A.length - 1;

        while (left < right) {
            if (A[left] % 2 == 0) {
                ++left;
            } else {
                if (A[right] % 2 != 0) {
                    --right;
                }
                if (A[right] % 2 == 0) {
                    swap(A, left, right);
                    ++left;
                    --right;
                }
            }
        }

        return A;
    }

    private static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
