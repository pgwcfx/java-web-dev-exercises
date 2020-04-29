package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethods2 {
    public static ArrayList<String> wordsWithSpecifiedCount(ArrayList<String> stringForLengthInArrayListPractice) {
        String[] stringArray = new String[stringForLengthInArrayListPractice.size()];
        stringForLengthInArrayListPractice.toArray(stringArray);
        ArrayList<String> wordLengthExample = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the word length for your search: ");
        int lengthSpecification = input.nextInt();
        input.close();
        for (int i=0; i<stringForLengthInArrayListPractice.size(); i++) {
            if (stringForLengthInArrayListPractice.get(i).length() == lengthSpecification) {
                wordLengthExample.add(stringForLengthInArrayListPractice.get(i));
            }
        }
        return wordLengthExample;
    }
}
