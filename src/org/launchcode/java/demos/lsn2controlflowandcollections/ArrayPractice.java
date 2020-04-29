package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] values = {1, 1, 2, 3, 5, 8};
        for (int value: values){
            System.out.println(value);
        }
        System.out.println('\n');
        for (int value: values){
            if (value%2 != 0){
                System.out.println(value);
            }
        }
        String greenEggsAndHamPractice = "I would not, could not, in a box. " +
                "I would not, could not with a fox. I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        String[] greenEggsAndHamArrayPractice = greenEggsAndHamPractice.split(" ");
        System.out.println(Arrays.toString(greenEggsAndHamArrayPractice));
        String[] greenEggsAndHamSentenceArrayPractice = greenEggsAndHamPractice.split("\\.");
        System.out.println(Arrays.toString(greenEggsAndHamSentenceArrayPractice));
    }
}
