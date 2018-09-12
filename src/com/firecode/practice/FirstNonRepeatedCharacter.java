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

		Set<Character> dupset=new HashSet<>();
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
		else return set.iterator().next().charValue();

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

		System.out.println(FirstNonRepeatedCharacter.firstNonRepeatedCharacter("aaadrfedr"));
		int A[]= {1,1,1,4,5,6,7,7,6,4};
		System.out.println(FirstNonRepeatedCharacter.firstNonRepeatedInteger(A));



		
		
	}






}
