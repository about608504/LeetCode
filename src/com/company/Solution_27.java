package com.company;

public class Solution_27 {
    public int removeElement(int[] A, int elem) {
        int len = A.length;
        for (int i = 0; i < len; i++) {
            while (A[i] == elem && i < len) {
                len --;
                A[i] = A[len];
            }
        }
        return len;
    }
}
