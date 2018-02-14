package com.company;

public class Solution_9 {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int p = x;
        int q = 0;
        while (p >= 10) {
            q = q*10;
            q = q + p % 10;
            p = p / 10;
        }
        return (q == x / 10) && (p == x % 10);
    }
}
