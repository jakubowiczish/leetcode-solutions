package _00005_longest_palindromic_substring;

public class LongestPalindromicSubstring {

    public static String longestPalindrome(String s) {
        if (s == null || s.length() == 0 || s.length() == 1) return s;

        String longestSubstring = s.substring(0, 1);
        for (int i = 0; i < s.length(); ++i) {
            String found = finder(s, i, i); // odd
            if (found.length() > longestSubstring.length())
                longestSubstring = found;

            found = finder(s, i, i + 1); // even
            if (found.length() > longestSubstring.length())
                longestSubstring = found;
        }

        return longestSubstring;
    }

    private static String finder(String s, int startIndex, int endIndex) {
        while (startIndex >= 0 && endIndex <= s.length() - 1
                && s.charAt(startIndex) == s.charAt(endIndex)) {
            --startIndex;
            ++endIndex;
        }

        return s.substring(startIndex + 1, endIndex);
    }
}
