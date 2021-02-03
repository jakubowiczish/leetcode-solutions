package _00349_intersection_of_two_arrays;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> numbersFirst = new HashSet<>();
        for (int n : nums1) {
            numbersFirst.add(n);
        }

        Set<Integer> res = new HashSet<>();
        for (int n : nums2) {
            if (numbersFirst.contains(n)) {
                res.add(n);
            }
        }

        int[] resArr = new int[res.size()];

        int i = 0;
        for (int x : res) {
            resArr[i++] = x;
        }

        return resArr;
    }
}
