package _00125_valid_palindrome;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();

        int i = 0;
        int j = chars.length - 1;
        while (i < j) {
            if (!Character.isLetterOrDigit(chars[i]))
                ++i;
            else if (!Character.isLetterOrDigit(chars[j]))
                --j;
            else if (Character.toLowerCase(chars[i++]) != Character.toLowerCase(chars[j--]))
                return false;
        }

        return true;
    }
}
