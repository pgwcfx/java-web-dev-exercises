package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.ArrayList;

public class ArrayListMethods {
    public static int getEvenNumbers(ArrayList<Integer> numbersForArrayListPractice){

        Integer[] numbersArray = new Integer[numbersForArrayListPractice.size()];
        numbersForArrayListPractice.toArray(numbersArray);
        int sum = 0;
        for (int i = 0; i < numbersForArrayListPractice.size(); i++){
            if (numbersArray[i] %2 == 0){
                sum += numbersForArrayListPractice.get(i);
            } else {
                sum += 0;
            }
        }
        System.out.println("The sum of the even numbers in the array is " + sum);
        return sum;
    }
}
