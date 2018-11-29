package com.firecode.practice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.*;


public class SingleNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* print unique numbers in the array(1st way)
		int arr[] = {1,2,3,4,1,2,4,3,5};
		int len=arr.length;
		int count;

		for(int i=0;i<len;i++)
		{
			count=0;
			for(int j=0;j<len;j++)
			{
				if(i!=j){
					if (arr[i] == arr[j]) {
						count++;
					}
				}
			}
			//System.out.println("unique element  "+arr[i]+"count"+count);
			if(count==0)
			System.out.println("unique element  "+arr[i]);
		}*/

		/* print unique numbers in the array(2nd way)
		int arr[] = {1,2,3,4,1,2,4,3,5};
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
				System.out.println("Hash set values: "+ set);*/


     //print all duplicate numbers in the array
	/*	int arr[] = {1,2,3,4,1,2,5,4,3,1};
		int len=arr.length;
		TreeSet<Integer> set=new TreeSet<Integer>();
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len;j++)
			{
				if(i!=j){
					if (arr[i] == arr[j]) {
						int s=arr[i];
						set.add(s);

					}
				}
			}
		}

		int ar[]=new int[set.size()];
		int k=0;
			Iterator<Integer> itr=set.iterator();
			while(itr.hasNext()){
				ar[k]=itr.next();
				k++;
			}
		System.out.printf("Modified ar[] : %s", Arrays.toString(ar));*/



	/*  print all duplicate numbers in the array(incomplete code)
		int arr[] = {1,2,3,4,1,2,5,4,3,1};
		int len=arr.length;

		int ar[]=new int[len];

		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len;j++)
			{
				if(i!=j){
					System.out.println("i is"+i+"    "+j);
					if (arr[i] == arr[j]) {
						for(int k=0;k<len;k++)
						{
							if(i<j){
								System.out.println("arr[i] is"+arr[i]+"arr[j] is"+arr[j]);
							ar[i]=arr[i];}
						}
					}
				}
			}
		}
			Arrays.sort(ar);
		System.out.printf("Modified ar[] : %s", Arrays.toString(ar));*/



	}

}
