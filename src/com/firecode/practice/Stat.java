package com.firecode.practice;

import java.util.ArrayList;

public class Stat {


    public static ArrayList<String> x;

    public static ArrayList<String> getX() {
        return x;
    }

    public static void setX(ArrayList<String> x) {
        Stat.x = x;
    }

    void change()
    {
       x.add("ab");
       x.add("bc");
       x.add("cd");
    }

  /*  public static void main(String args[])
    {
        Stat s=new Stat();
       // s.change();
        System.out.println(s.getX());

    }*/
}
