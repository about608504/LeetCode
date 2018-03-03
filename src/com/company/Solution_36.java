package com.company;

import java.util.HashSet;
import java.util.Set;

public class Solution_36 {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++) {
            Set<Character> rows = new HashSet<Character>();
            Set<Character> cols = new HashSet<Character>();
            Set<Character> cubes = new HashSet<Character>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.' && !rows.add(board[i][j])) return false;
                if (board[j][i] != '.' && !cols.add(board[j][i])) return false;
                int colOffset = j % 3, rowOffset = j / 3;
                int colStart = 3 * (i % 3), rowStart = 3 * (i / 3);
                int row = rowStart + rowOffset, col = colStart + colOffset;
                if (board[row][col] != '.' && !cubes.add(board[row][col]) )return false;
            }
        }
        return true;
    }


}
