class Solution {
    public void setZeroes(int[][] matrix) {
         
         int n = matrix.length;
         int m = matrix[0].length;

         // taking it for marking 
         int row[] = new int[n];
         int col[] = new int[m];

        
         for(int i = 0; i<n; i++)
         {
            for(int j =0; j<m; j++)
            {
                if(matrix[i][j]==0)  // if 0 found, mark it as dummy -5 
                {
                    row[i]=-5;
                    col[j]=-5;
                }
            }
         }

         for(int i = 0; i<n; i++)
         {
            for(int j = 0; j<m; j++)
            {
                if(row[i]==-5 || col[j]==-5) // if found marked -5, then change to 0
                {
                    matrix[i][j]=0;
                }
            }
         }

    }
}
