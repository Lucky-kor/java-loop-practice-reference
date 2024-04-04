package com.choongang;

public class E_MakeDigits {
    public String makeDigits(int num) {
        String result = "";

        for(int i = 1; i <= num; i++) {
            //String 타입의 값과 int타입의 값을 더해주는 경우, 자동으로 int타입의 값은 String으로 변환되어 저장됩니다.
            result = result + i;
        }

        return result;
    }
}
