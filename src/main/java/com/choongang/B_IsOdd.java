package com.choongang;

public class B_IsOdd {
    public boolean isOdd(int num) {
        if(num < 0) {
            num = -num;
        }

        while(num > 0) {
            if(num == 1) {
                //1에 도달한 경우 홀수이므로 true를 반환합니다.
                return true;
            }
            num = num - 2;
        }
        //반복문을 모두 순회할때까지 false를 반환하지 않는 경우 (num == 0일 경우) 짝수이므로 false를 반환합니다.
        return false;
    }
}
