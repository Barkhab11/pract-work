package com.firecode.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
//map(string,object)
public class HashMapIteration {


    private ArrayList<String> oldName;

    @Override
    public String toString() {
        return "oldName=" + oldName;
    }

    public HashMapIteration() {
        oldName = new ArrayList<String>();
    }


    public ArrayList<String> getOldName() {
        return oldName;
    }

    public void addOldName(String name) {
        oldName.add(name);
    }

  /* public void setOldName(ArrayList<String> oldName) {
        this.oldName = oldName;
    }*/

/*    public void display() {
        oldName.add("buy1");
        oldName.add("buy2");


        //arraylist iteration
        for (String oldName :getOldName()) {
                System.out.println(oldName);
        }

         *//* for (int counter = 0; counter < oldName.size(); counter++) {
            System.out.println(oldName.get(counter));
        }
        *//*
    }*/

        public static void main(String args[]){
            HashMapIteration u = new HashMapIteration();
           // u.display();

            u.addOldName("str");
            u.addOldName("str1");
            u.addOldName("str2");

            for (String oldName :u.getOldName()) {
                System.out.println("olddddd nameeeee"+oldName);
            }


            HashMap<String,HashMapIteration> map=new HashMap<>();
            map.put("onse",u);
            map.put("two",u);

            //map iteration
            for (String key : map.keySet()) {
                System.out.println(key + " : " + map.get(key));
            }

            //map iteration
            for (Map.Entry<String, HashMapIteration> entry : map.entrySet()) {
                System.out.println("fjvjhbhf"+entry.getKey() + " : " + entry.getValue());
            }

        }


}
