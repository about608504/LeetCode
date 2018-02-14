package com.company;

public class Solution_5 {
    public String longestPalindrome(String s) {
        if (s == null || s.length() <= 1) return s;
        boolean[][] dp = new boolean[s.length()][s.length()];
        char[] w = s.toCharArray();
        int maxLen = 0;
        String maxSub = null;
        dp[s.length() - 1][s.length() - 1] = true;
        for (int i = s.length() - 2; i >= 0; --i) {
            int maxJ = i;
            for (int j = i + 1; j < s.length();j++) {
                if (w[j] == w[i] && ((j < i + 3) || dp[i + 1][j - 1])) {
                    dp[i][j] = true;
                    maxJ = j;
                }else{
                    dp[i][j] = false;
                }
            }
            if (maxJ - i + 1 > maxLen) {
                maxLen = maxJ - i + 1;
                maxSub = s.substring(i, maxJ + 1);
            }
        }
        return maxSub;
    }
}
