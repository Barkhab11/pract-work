package com.firecode.practice;

public class Flip2dMatrix {


    public static void main(String[] args) {

        int[][] matrix ={{1,2,3},{4,5,6}};
        //flipItVerticalAxis(matrix);

        flipHorizontalAxis(matrix);

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                System.out.print(matrix[i][j]);
            }
            System.out.println("/n");
        }

    }

    public static void flipHorizontalAxis(int[][] matrix) {

    int start=0;
    int end=matrix.length-1;


    while(start<end)
    {
        int temp[]=matrix[start];
        matrix[start]=matrix[end];
        matrix[end]=temp;
        start++;end--;
    }

    }





    public static void flipItVerticalAxis(int[][] matrix) {

        for(int i=0;i<matrix.length;i++) {
            int start = 0;
            int end = matrix[i].length-1;
            int temp=0;

            while(start<end)
            {
                temp=matrix[i][start];
                matrix[i][start]=matrix[i][end];
                matrix[i][end]=temp;
                start++;
                end--;
            }


        }

    }





}
