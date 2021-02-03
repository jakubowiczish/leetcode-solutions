package _00350_intersection_of_two_arrays_2;

import java.util.*;

public class IntersectionOfTwoArrays2 {

    public static void main(String[] args) {
        int[] nums1 = {2, 3, 3, 4, 5, 6, 7};
        int[] nums2 = {2, 3, 3, 3, 4, 4, 4, 4, 7};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            map.merge(num, 1, Integer::sum);
        }

        List<Integer> resultList = new ArrayList<>();
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                resultList.add(num);
                map.merge(num, -1, Integer::sum);
            }
        }

        return toIntArray(resultList);
    }


    // faster than resultList.stream().mapToInt(e -> e).toArray();
    private static int[] toIntArray(List<Integer> list) {
        int[] ret = new int[list.size()];
        for (int i = 0; i < ret.length; i++)
            ret[i] = list.get(i);

        return ret;
    }
}
