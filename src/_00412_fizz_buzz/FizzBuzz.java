package _00412_fizz_buzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>(n);

        int fizz = 0, buzz = 0;
        for (int i = 1; i <= n; i++) {
            ++fizz;
            ++buzz;

            if (fizz == 3 && buzz == 5) {
                result.add("FizzBuzz");
                fizz = buzz = 0;
            } else if (fizz == 3) {
                result.add("Fizz");
                fizz = 0;
            } else if (buzz == 5) {
                result.add("Buzz");
                buzz = 0;
            } else {
                result.add(String.valueOf(i));
            }
        }

        return result;
    }
}
