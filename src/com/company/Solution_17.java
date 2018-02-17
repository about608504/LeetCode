package com.company;

import java.util.LinkedList;
import java.util.List;

public class Solution_17 {
    private static final String[] KEYS = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> ret = new LinkedList<String>();
        combination("", digits, 0, ret);
        return ret;
    }

    private void combination(String prefix, String digits, int offest, List<String> ret) {
        if (offest >= digits.length()) {
            ret.add(prefix);
            return;
        }
        String letters = KEYS[(digits.charAt(offest)) - '0'];
        for (int i = 0; i <= letters.length(); i++) {
            combination(prefix + letters.charAt(i), digits, offest + 1, ret);
        }
    }
}
