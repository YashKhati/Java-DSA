package MatrixQuestions;

import java.lang.reflect.Array;
import java.util.Arrays;

/*

Leetcode - 1727

Problem Statement : You are given a binary matrix of size m x n,
and you are allowed to rearrange the columns of the matrix in any order.

Return the area of the largest sub-matrix within matrix where every element
of the sub-matrix is 1 after reordering the columns optimally.

Input -> matrix = [[0,0,1],[1,1,1],[1,0,1]]
Output -> 4

 */
public class LargestSubMatrixWithRearrangements
{
    public static void main(String[] args) {

        int[][] matrix = {{0,0,1} , {1,1,1} , {1,0,1}};

        int ans = largestSubmatrix(matrix);

        System.out.println("Ans : "+ans);
    }
    static public int largestSubmatrix(int[][] matrix)
    {
        int row = matrix.length;
        int col = matrix[0].length;

        int ans = 0;
        for (int i = 0 ; i<row; i++)
        {
            for (int j = 0 ; j<col; j++)
            {
                if(matrix[i][j] != 0 && i > 0){
                    matrix[i][j] += matrix[i-1][j];
                }
            }

            int[] tempRow = matrix[i].clone();
            Arrays.sort(tempRow);
            for(int k=0; k<col; k++)
            {
                   ans = Math.max(ans,tempRow[k]*(col-k));
            }
        }

        return  ans;
    }
}
