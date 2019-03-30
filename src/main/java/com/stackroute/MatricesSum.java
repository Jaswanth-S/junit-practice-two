package com.stackroute;

public class MatricesSum {

    public int[][] calculateMatricesSum(int rows,int columns,int[][] matrix_one,int[][] matrix_two)
    {
        int[][] result=new int[rows][columns];

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                result[i][j] = matrix_one[i][j]+matrix_two[i][j];
            }
        }
        return result;
    }
}
