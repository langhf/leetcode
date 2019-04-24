package com.drelang.algorithms.p200_numberOfIslands;

/**
 * DFS (Depth-First-Search) 深度优先搜索
 * 1. 遍历二维数组的每一个元素， 若元素为 '1' 则进行DFS，并且将原来的 '1' 变成 '0'
 * 2. 统计有多少片 '1' 区域
 *
 * Created by Drelang on 2019/02/09 18:25
 */
public class SolutionA extends Solution {
    // 行数
    private int m;
    // 列数
    private int n;

    @Override
    public int numIslands(char[][] grid) {
        m = grid.length;
        if(m == 0) {
            return 0;
        }
        int count = 0;
        n = grid[0].length;
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(grid[i][j] == '1') {
                    DFSMarking(grid, i, j);
                    ++count;
                }
            }
        }
        return count;
    }

    private void DFSMarking(char[][] grid, int i, int j) {
        // 递归终止条件
        if(i<0 || j<0 || i>=m || j>=n || grid[i][j] != '1') {
            return ;
        }
        grid[i][j] = '0';
        DFSMarking(grid, i-1, j);
        DFSMarking(grid, i+1, j);
        DFSMarking(grid, i, j-1);
        DFSMarking(grid, i, j+1);
    }
}
