package _00204_count_primes;

public class CountPrimes {

    public int countPrimes(int n) {
        if (n <= 1) return 0;

        boolean[] isNotPrime = new boolean[n];
        isNotPrime[0] = isNotPrime[1] = true;

        for (int i = 2; i * i < n; i++) {
            if (!isNotPrime[i]) {
                for (int j = 2; i * j < n; j++) {
                    isNotPrime[i * j] = true;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!isNotPrime[i]) ++count;
        }

        return count;
    }
}
