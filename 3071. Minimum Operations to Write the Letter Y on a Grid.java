//3071. Minimum Operations to Write the Letter Y on a Grid
//weekly contest 387
class Solution {
     public int minimumOperationsToWriteY(int[][] grid) {
        int n = grid.length;
        int c1 = 0, c2 = 0, c0 = 0, y0 = 0, y1 = 0, y2 = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j){
                    if(i <= n / 2 && j <= n / 2){
                        if(grid[i][j] == 0){
                            y0++;
                        }else if(grid[i][j] == 1){
                            y1++;
                        }else if(grid[i][j] == 2){
                            y2++;
                        }
                        grid[i][j] = -1;
                    }
                }
                if(i < n / 2 && i + j == n - 1){
                    if(grid[i][j] == 0){
                        y0++;
                    }else if(grid[i][j] == 1){
                        y1++;
                    }else if(grid[i][j] == 2){
                        y2++;
                    }
                    grid[i][j] = -1;
                }
                if(i > n / 2 && j == n / 2){
                    if(grid[i][j] == 0){
                        y0++;
                    }else if(grid[i][j] == 1){
                        y1++;
                    }else if(grid[i][j] == 2){
                        y2++;
                    }
                    grid[i][j] = -1;
                }
            }
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 0){
                        c0++;
                    }else if(grid[i][j] == 1){
                        c1++;
                    }else if(grid[i][j] == 2){
                        c2++;
                    }
                    grid[i][j] = -1;
            }
        }
        
        int y = y0 + y1 + y2;
        int c = c0 + c1 + c2;
        
        int ans = n * n;
        ans = Math.min(ans, (y - y0) + (c - c1));
        ans = Math.min(ans, (y - y0) + (c - c2));
        ans = Math.min(ans, (y - y1) + (c - c0));
        ans = Math.min(ans, (y - y1) + (c - c2));
        ans = Math.min(ans, (y - y2) + (c - c1));
        ans = Math.min(ans, (y - y2) + (c - c0));
        
        return ans;
    }
}
