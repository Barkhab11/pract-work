package com.firecode.practice;

public class FirstNonRepeatedCharacter {
	
	
	
	
	public static Character firstNonRepeatedCharacter(String str) {
	
		String strg=str;
		char chr[]= strg.toCharArray();
		char ch =0;
		for(int i=0;i<chr.length;i++)
		{
			for(int j=1;j<chr.length;j++)
			{
				if(chr[i]==chr[j])
				{
					break;
				}
					
			
			}
			ch=chr[i];
		}
		
		return ch;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(FirstNonRepeatedCharacter.firstNonRepeatedCharacter("abcdcd"));
		
		
		
	}

}
