package com.company;

public class Solution_7 {
    public int revers(int x) {
        int ans = 0;
        while (x != 0) {
            int temp = ans * 10 + x % 10;
            if (temp / 10 != ans) {
                return 0;//checks overflow
            }
            ans = temp;
            x = x / 10;
        }
        return ans;
    }

}
