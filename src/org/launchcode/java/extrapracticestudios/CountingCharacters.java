package org.launchcode.java.extrapracticestudios;

import java.util.HashMap;

public class CountingCharacters {
    public static void main(String[] args){
        String word = "bobcat";
        char[] wordCharacterArray = word.toCharArray();
        HashMap<Character, Integer> letterCount = new HashMap<>();

        for (char i : wordCharacterArray){
            if (letterCount.containsKey(i)){
                letterCount.put(i, letterCount.get(i)+1);
            } else {
                letterCount.put(i, 1);
            }
        }
        System.out.println(letterCount);
    }
}
