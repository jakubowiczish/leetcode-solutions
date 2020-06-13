package _00507_perfect_number;

public class PerfectNumber {

    public static void main(String[] args) {
        boolean res = checkPerfectNumber(28);
        System.out.println(res);
    }

    public static boolean checkPerfectNumber(int num) {
        if (num <= 1) return false;

        int sum = 1;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i + num / i;
            }
        }

        return sum == num;
    }
}
