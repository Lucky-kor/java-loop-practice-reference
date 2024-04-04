package com.choongang;

public class F_MakeDigits2 {
    public String makeDigits2(int num) {
        String result = "1";

        int index = 2;
        while(index <= num) {
            result = result + "-" + index;
            index++;
        }

        return result;
    }
}
