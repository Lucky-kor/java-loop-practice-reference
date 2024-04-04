package com.choongang;

public class Q_IsPrime {
    public boolean isPrime(int num) {
        int sqrt = (int) Math.sqrt(num);

        if (num == 1) {
            return false;
        }

        if (num == 2) {
            return true;
        }

        if (num % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= sqrt; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
