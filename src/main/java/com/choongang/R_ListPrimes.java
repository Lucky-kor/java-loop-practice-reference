package com.choongang;

public class R_ListPrimes {
    public String listPrimes(int num) {
        // 초기값은 2로 지정.
        // 2를 넣음으로써, 마지막에 "-"를 제외할 필요가 없어집니다.
        String result = "2";

        // 3부터 NUM까지 순회하며 숫자를 선택하고
        for(int candi = 3; candi <= num; candi++) {
            // 해당 숫자의 root를 씌우고, 나머지를 버립니다.
            int sqrt = (int) Math.sqrt(candi);
            // 소수 여부를 저장할 변수 선언
            boolean isPrime = true;
            // 2부터 candi까지 순회합니다.
            // 여기는 현재 선택한 숫자가 소수인지 확인하기 위해 순회하는 코드입니다.
            for(int i = 2; i <= sqrt; i++) {
                // 나누어 떨어지면 소수가 아니므로, isPrime을 false로 할당
                if(candi % i == 0) {
                    isPrime = false;
                }
            }

            // 반복문 순회 후, 나누어 떨어지는 수가 있었는지 봄
            // 없다면(isPrime == true) 소수이므로 추가함
            if(isPrime) {
                result += "-" + candi;
            }
        }

        // 모든 순회가 끝나면 소수만 저장되어 있으므로, 바로 반환
        return result;
    }
}
