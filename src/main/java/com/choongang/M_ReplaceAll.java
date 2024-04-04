package com.choongang;

public class M_ReplaceAll {
    public String replaceAll(String str, char from, char to) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == from) {
                result = result + to;
            } else {
                result = result + str.charAt(i);
            }
        }

        return result;
    }
}
