package _00205_isomorphic_strings;

import java.util.Arrays;

public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        int[] arr1 = new int[256];
        int[] arr2 = new int[256];
        Arrays.fill(arr1, -1);
        Arrays.fill(arr2, -1);

        for (int i = 0; i < s.length(); i++) {
            if (arr1[s.charAt(i)] != arr2[t.charAt(i)]) return false;
            arr1[s.charAt(i)] = i;
            arr2[t.charAt(i)] = i;
        }

        return true;
    }
}
