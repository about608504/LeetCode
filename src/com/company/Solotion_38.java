package com.company;

public class Solotion_38 {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        } else {
            StringBuilder result = new StringBuilder();
            String s = countAndSay(n - 1);
            int len = s.length();
            int i = 0;
            while (i < len) {
                int count = 1;
                char ch = s.charAt(i++);
                while (i < len && s.charAt(i) == ch) {
                    ++count;
                    ++i;
                }
                result.append(count).append(ch);
            }
            return result.toString();
        }
    }
}
