package com.test.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by AnupamShanti on 7/18/2017.
 */
public class SetExample {
    public static void main(String args[]){

        //HashSet does not maintain the order
      //  Set<String> hashSet=new HashSet<String>();

        //Linked HashSet maintains the insertion order
//        Set<String> hashSet=new LinkedHashSet<String>();

        // TreeSet sorts the data in Natural order or Ascending order
        Set<String> hashSet=new TreeSet<String>();

        hashSet.add("Dog");
        hashSet.add("Cat");
        hashSet.add("Mouse");
        hashSet.add("Snake");


        // Adding dupicate items
        hashSet.add("Mouse");
        System.out.println(hashSet);
    }
}
