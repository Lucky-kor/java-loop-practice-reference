package com.choongang;

public class N_CharacterAndNumber {
    public String characterAndNumber(String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            result = result + word.charAt(i) + i;
        }
        return result;
    }
}
