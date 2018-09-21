package com.firecode.practice;

import java.util.*;

public class FirstNonRepeatedCharacter {
	
	
	
	
/*have to coorect this solution
	public static Character firstNonRepeatedCharacter(String str) {

		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for(int i=0;i<str.length();i++)
		{
			if(!set.add(str.charAt(i)))
			{
				set.remove(str.charAt(i));
			}
		}
		if(set.isEmpty())
			return null;
		else return set.iterator().next().charValue();

	}*/

	public static Character firstNonRepeatedCharacter(String str) {

		//solution1
	/*	Set<Character> dupset=new HashSet<>();
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for(int i=0;i<str.length();i++)
		{
			if(!set.add(str.charAt(i)))
			{
				dupset.add(str.charAt(i));
			}
		}
		set.removeAll(dupset);
		if(set.isEmpty())
			return null;
		else return set.iterator().next().charValue();*/

	//solution2
		char ch[]=str.toCharArray();

		int count=0;
        char chh = '\0';

		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<ch.length;j++)
			{
				if(str.charAt(i)==ch[j])
					count++;
			}
           // System.out.println("count is  "+count+"str[i]  "+str.charAt(i));
			if(count==1) {
				chh = str.charAt(i);
				break;
			}
			count=0;

		}

		if(chh!='\0')
		return chh;
		else return null;



	}


	public static Integer firstNonRepeatedInteger(int A[]) {

	Set<Integer> dupset=new HashSet<>();

	LinkedHashSet<Integer> lh=new LinkedHashSet<Integer>();

	for(int i=0;i<A.length;i++)
	{
		if(!lh.add(A[i]))
		{
			dupset.add(A[i]);
		}
	}
	lh.removeAll(dupset);


	return lh.iterator().next();


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(FirstNonRepeatedCharacter.firstNonRepeatedCharacter("aaaa"));
		//int A[]= {1,1,1,4,5,6,7,7,6,4};
		//System.out.println(FirstNonRepeatedCharacter.firstNonRepeatedInteger(A));



	}



		
		
	}






