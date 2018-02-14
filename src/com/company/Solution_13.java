package com.company;

import java.util.HashMap;
import java.util.Map;
public class Solution_13 {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int num = 0;
        char prev = '#';
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            int value = map.get(ch);
            if (value < num && ch != prev) {
                num = num - value;
            } else {
                num = num + value;
            }
            prev = ch;
        }
        return  num;
    }
}
