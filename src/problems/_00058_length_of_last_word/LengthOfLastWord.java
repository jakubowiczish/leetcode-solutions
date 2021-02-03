package _00058_length_of_last_word;

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        int lengthOfLastWord = 0;
        for (int i = s.length() - 1; i >= 0; --i) {
            if (s.charAt(i) == ' ' && lengthOfLastWord > 0) {
                return lengthOfLastWord;
            } else if (s.charAt(i) != ' ') {
                ++lengthOfLastWord;
            }
        }

        return lengthOfLastWord;
    }
}
