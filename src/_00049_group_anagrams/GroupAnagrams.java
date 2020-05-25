package _00049_group_anagrams;

import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            int[] arr = new int[26];

            for (int i = 0; i < s.length(); i++) {
                arr[s.charAt(i) - 'a']++;
            }

            String key = Arrays.toString(arr);
            List<String> tmp = map.getOrDefault(key, new ArrayList<>());
            tmp.add(s);
            map.put(key, tmp);
        }

        return new LinkedList<>(map.values());
    }
}
