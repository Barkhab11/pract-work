package com.firecode.practice;

public class FindMissingNumber {

    public static void main(String[] args) {
        int arr[]={1,2,4,5,6,7,8,9,10};
      System.out.println(FindMissingNumber.findMissingNumber(arr));

    }

    public static int findMissingNumber(int[] arr) {
        int y=0;
        int z=0;
        int x=0;

        for(int i=0;i<arr.length;i++)
        {
            System.out.println("    "+arr[i]);
            while(i!=arr.length)
            {
                x=arr[i];
                y=arr[i+1]-1;
                if(x!=y)
                {
                    z=arr[i]+1;
                    break;
                }
            }
        }

        return z;
    }

}
