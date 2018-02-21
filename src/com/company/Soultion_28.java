package com.company;

public class Soultion_28 {
    public int strStr(String hatstack, String needle) {
        for (int i = 0 ; ; i++) {
            for (int j = 0 ; ; j++) {
                if (j == needle.length()) {
                    return i;
                }
                if (i + j == hatstack.length()) {
                    return -1;
                }
                if (needle.charAt(j) != hatstack.charAt(i + j)) {
                    break;
                }
            }
        }
    }
}
