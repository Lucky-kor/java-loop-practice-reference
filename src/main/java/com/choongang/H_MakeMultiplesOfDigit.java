package com.choongang;

public class H_MakeMultiplesOfDigit {
    public String makeMultiplesOfDigit(int num) {
        String result = "";

        for (int i = 3; i <= num; i += 3) {
            result = result + i;
        }

        return result;
    }
}
