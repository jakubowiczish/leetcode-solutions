package _00191_number_of_1_bits;

public class NumberOf1Bits {

    public int hammingWeight(int n) {
        int amountOfOnes = 0;

        while (n != 0) {
            amountOfOnes += (n & 1);
            n = n >>> 1;
        }

        return amountOfOnes;
    }
}
