package _00202_happy_number;

import java.util.ArrayList;
import java.util.List;

public class HappyNumber {

    public boolean isHappy(int n) {
        List<Integer> list = new ArrayList<>();
        return helpingHappy(list, n);
    }

    private boolean helpingHappy(List<Integer> list, int n) {
        int sum = 0;
        list.add(n);

        while (n != 0) {
            sum += (n % 10) * (n % 10);
            n /= 10;
        }

        if (sum == 1) return true;
        else if (list.contains(sum)) return false;
        else return helpingHappy(list, sum);
    }
}
