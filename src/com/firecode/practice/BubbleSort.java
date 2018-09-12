package com.firecode.practice;

public class BubbleSort {


    public static int[] bubbleSortArray(int[] arr){

    int len=arr.length;
    int temp=0;

    for(int i=0;i<len;i++)
    {
        for(int j=1;j<(len-i);j++)
        {
            if(arr[j-1]>arr[j])
            {
                temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
            }
        }
    }


        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        return arr;
    }

    public static void main(String args[]) {


        int arr[]= {9,5,3,7,1,5,4};

       bubbleSortArray(arr);


        }
}
