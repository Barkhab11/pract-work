package com.firecode.practice;

import java.util.HashSet;
import java.util.Set;

public class SingleNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,1,1,2};
		int len=arr.length;
		int count;

		for(int i=0;i<len;i++)
		{
			count=0;
			for(int j=0;j<len;j++)
			{
				if(i!=j) {
					//System.out.println("arr[i]" + arr[i] + "arr[j]" + arr[j]);
					if (arr[i] == arr[j]) {
						count++;
					}
				}
			}
			//System.out.println("unique element  "+arr[i]+"count"+count);
			if(count==0)
			System.out.println("unique element  "+arr[i]);
		}









/*		int len=arr.length;
				Set<Integer> set=new HashSet<Integer>();
				for(int i=0;i<len;i++)
				{
				boolean s=set.add(arr[i]);
					if(s==false)
					{
						set.remove(arr[i]);
					}
				}
				int k=0;
				for(Integer j : set)
				{
					k=j;
				}
				System.out.println("Hash set values: "+ set);*/
		




		
		
	}

}
