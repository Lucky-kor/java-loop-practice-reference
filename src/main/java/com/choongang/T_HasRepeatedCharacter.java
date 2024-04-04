package com.choongang;

public class T_HasRepeatedCharacter {
    public boolean hasRepeatedCharacter(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }
}
