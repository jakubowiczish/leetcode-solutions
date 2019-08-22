package _00009_palindrome_number;

public class PalindromeNumberWorseSollution {

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x % 10 == 0 && x != 0) return false;

        return x == getPalindrome(x);
    }

    private int getPalindrome(int num) {
        int result = 0;

        while (num != 0) {
            result = result * 10 + num % 10;
            num /= 10;
        }

        return result;
    }
}
