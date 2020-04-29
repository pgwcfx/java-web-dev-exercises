package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharactersStudio {
    public static void main(String[] args){
        String quote;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string that you want to use to count the number of appearances of each letter: ");
        quote = input.nextLine();
        input.close();
        /*String hiddenFiguresQuote = "If the product of two terms is zero then common sense says " +
                "at least one of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, " +
                "you can put the quadratics into a form that can be factored " +
                "allowing that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward from there.";*/
        char[] charactersInString = quote.toLowerCase().toCharArray();
        HashMap<Character,Integer> letterCount = new HashMap<>();
        for (char i: charactersInString){
            if (Character.isLetter(i)){
                if (letterCount.containsKey(i)){
                    letterCount.put(i,letterCount.get(i)+1);
                } else {
                    letterCount.put(i,1);
                }
            }
        }
        for (Map.Entry<Character,Integer> item : letterCount.entrySet()){
            System.out.println(item.getKey() + ": " + item.getValue());
        }
    }
}
