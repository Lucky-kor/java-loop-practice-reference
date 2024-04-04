package com.choongang;

public class U_MakeMarginalString {
    public String makeMarginalString(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j <= i; j++) {
                result = result + str.charAt(j);
            }
        }

        return result;
    }
}
