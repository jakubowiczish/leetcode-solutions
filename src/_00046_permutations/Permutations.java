package _00046_permutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Permutations {

    public static void main(String[] args) {
        System.out.println("ITERATIVE");
        for (List<Integer> list : permuteIterative(new int[]{1, 2, 3})) {
            System.out.println(Arrays.toString(list.toArray()));
        }

        System.out.println("\nRECURSIVE");
        for (List<Integer> list : permuteRecursive(new int[]{1, 2, 3})) {
            System.out.println(Arrays.toString(list.toArray()));
        }


    }

    public static List<List<Integer>> permuteIterative(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());

        for (int num : nums) {
            List<List<Integer>> currentList = new ArrayList<>();

            for (List<Integer> list : result) {
                for (int j = 0; j < list.size() + 1; j++) {
                    list.add(j, num);
                    List<Integer> temp = new ArrayList<Integer>(list);
                    currentList.add(temp);
                    list.remove(j);
                }
            }

            result = new ArrayList<>(currentList);
        }

        return result;
    }


    public static List<List<Integer>> permuteRecursive(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permuteRecursiveHelper(result, nums, 0);
        return result;
    }

    private static void permuteRecursiveHelper(List<List<Integer>> result, int[] nums, int k) {
        for (int i = k; i < nums.length; ++i) {
            swap(nums, i, k);
            permuteRecursiveHelper(result, nums, k + 1);
            swap(nums, k, i);
        }

        if (k == nums.length - 1) {
            result.add(Arrays.stream(nums).boxed().collect(toList()));
        }
    }

    private static void swap(int[] x, int a, int b) {
        int t = x[a];
        x[a] = x[b];
        x[b] = t;
    }
}
