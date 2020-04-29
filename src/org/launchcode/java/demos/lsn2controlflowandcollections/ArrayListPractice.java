package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args){
        ArrayList<Integer> numbersForArrayListPractice = new ArrayList<>();
        numbersForArrayListPractice.add(7);
        numbersForArrayListPractice.add(11);
        numbersForArrayListPractice.add(21);
        numbersForArrayListPractice.add(4);
        numbersForArrayListPractice.add(1);
        numbersForArrayListPractice.add(9);
        numbersForArrayListPractice.add(16);
        numbersForArrayListPractice.add(25);
        numbersForArrayListPractice.add(36);
        numbersForArrayListPractice.add(49);
        numbersForArrayListPractice.add(64);
        numbersForArrayListPractice.add(81);
        numbersForArrayListPractice.add(100);
        numbersForArrayListPractice.add(8);
        numbersForArrayListPractice.add(64);
        numbersForArrayListPractice.add(216);
        int arraySum = ArrayListMethods.getEvenNumbers(numbersForArrayListPractice);
        System.out.println(arraySum);
        String greenEggsAndHam = "I would not, could not, in a box." +
                " I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        ArrayList<String> stringForLengthInArrayListPractice = new ArrayList<String>(Arrays.asList(greenEggsAndHam.split(" ")));
        ArrayList<String> newStringExample = ArrayListMethods2.wordsWithSpecifiedCount(stringForLengthInArrayListPractice);
        for (String item: newStringExample){
            System.out.println(item);
        }
    }
}
