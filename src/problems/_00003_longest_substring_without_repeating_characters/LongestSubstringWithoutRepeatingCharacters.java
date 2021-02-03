package _00003_longest_substring_without_repeating_characters;

import java.util.LinkedList;
import java.util.Queue;


// TODO: find out a better solution
public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        String s1 = "abcabcbb";
        int l1 = lengthOfLongestSubstring(s1);
        System.out.println(l1);

        String s2 = "bbbbb";
        int l2 = lengthOfLongestSubstring(s2);
        System.out.println(l2);

        String s3 = "pwwkew";
        int l3 = lengthOfLongestSubstring(s3);
        System.out.println(l3);
    }

    public static int lengthOfLongestSubstring(String s) {
        Queue<Character> queue = new LinkedList<>();
        int maxLength = 0;

        for (char c : s.toCharArray()) {
            while (queue.contains(c)) {
                queue.poll();
            }

            queue.offer(c);
            maxLength = Math.max(maxLength, queue.size());
        }

        return maxLength;
    }
}
