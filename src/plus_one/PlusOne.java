package plus_one;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        int length = digits.length;
        int i;

        for (i = length - 1; i >= 0; --i) {
            if (digits[i] < 9) {
                ++digits[i];
                return digits;
            }

            digits[i] = 0;
        }

        int[] allNinesResult = new int[length + 1];
        allNinesResult[0] = 1;

        return allNinesResult;
    }

}
