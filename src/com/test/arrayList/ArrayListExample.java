package com.test.arrayList;

import java.util.Arrays;
import java.util.List;

/**
 * Created by AnupamShanti on 7/17/2017.
 */
public class ArrayListExample {
    public static void main(String[] args){
        List<Integer> numbers= Arrays.asList(
                new Integer(10),
                new Integer(20),
                new Integer(5),
                new Integer(9)
        );
      //  numbers.remove(numbers.size() - 1);
      //  numbers.remove(0);


        for (Integer integer: numbers) {
            System.out.println(integer);
        }


    }
}
