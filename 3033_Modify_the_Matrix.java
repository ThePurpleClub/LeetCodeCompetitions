//3033. Modify the Matrix
//Weekly Contest 384

class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int[][] answer = new int[matrix.length][matrix[0].length];
        int[] maxLen = new int[matrix[0].length];
        Arrays.fill(maxLen, Integer.MIN_VALUE);
        for(int row = 0; row<matrix.length; row++){
            for(int i = 0; i<matrix[0].length; i++){
                maxLen[i] = Math.max(maxLen[i], matrix[row][i]);
            }
        } 
        
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(matrix[i][j]==-1)
                    answer[i][j]=maxLen[j]; 
                else
                    answer[i][j]=matrix[i][j];
            }
        }
        return answer;
    }
}
