package java8.intpredicate;

import java.util.function.IntPredicate;

public class inpredicate {
    public static void main(String[] args) {
        IntPredicate isPrime = num -> {
            if (num <= 1) return false;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) return false;
            }
            return true;
        };
        System.out.println(isPrime.test(5));
    }
}
