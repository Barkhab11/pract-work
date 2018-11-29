package com.firecode.practice;

public class ISStringPalindrome {



    public static void main(String[] args) {


        System.out.println(isStringPalindrome(null));


    }



    public static boolean isStringPalindrome(String str){



        if(str==null)
            return false;

        int len=str.length()-1;
        String s="";

        for(int i=len;i>=0;i--)
        {
            System.out.println(str.charAt(i));
            s=s+str.charAt(i);
        }


        if(str.equals(s))
            return true;
        else return false;

    }



}
