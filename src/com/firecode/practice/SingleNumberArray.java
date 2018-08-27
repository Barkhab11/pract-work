package com.firecode.practice;

import java.util.HashSet;
import java.util.Set;

public class SingleNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,2,3,4,1,2,4,3,5,5,8};
		
		int len=arr.length;
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
				//return k;
				System.out.println("Hash set values: "+ set);
		
		
		
		
		
	}

}
