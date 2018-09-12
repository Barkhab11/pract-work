package com.firecode.practice;

import java.util.LinkedHashSet;

public class AreAllCharactersUnique {


    public static boolean areAllCharactersUnique(String str) {

        if(str==null)
            return true;

        char[] ch = str.toCharArray();
        LinkedHashSet<Character> set = new LinkedHashSet<Character>();

        for (int i = 0; i < ch.length; i++) {
            set.add(ch[i]);

        }

        int chlen=ch.length;
        int len=set.size();

        if(chlen==len)
            return true;
        else return false;

    }




    public static void main(String args[])
    {
        System.out.println(areAllCharactersUnique(null));
    }
}
