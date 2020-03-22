package _00387_first_unique_character_in_a_string;

public class FirstUniqueCharacterInString {

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
        System.out.println(firstUniqChar("loveleetcode"));
    }

    public static int firstUniqChar(String s) {
        int[] occurrences = new int[26];
        char[] chars = s.toCharArray();

        for (char c : chars)
            ++occurrences[c - 'a'];

        for (int i = 0; i < s.length(); i++) {
            if (occurrences[s.charAt(i) - 'a'] == 1) return i;
        }

        return -1;
    }
}
