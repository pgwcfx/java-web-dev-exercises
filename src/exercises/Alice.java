package exercises;

import java.util.Scanner;
public class Alice {
    public static void main(String[] args) {
        String wonderlandAdventures = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice " +
                "'without pictures or conversation?'";
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("What term would you like to search for? ");
        String term = input.next();
        if (wonderlandAdventures.toLowerCase().contains(term.toLowerCase())){
            System.out.println("The term you searched for was found.");
            System.out.println("The term you searched for is at index " + wonderlandAdventures.toLowerCase().indexOf(term.toLowerCase()));
            System.out.println("The term you searched for has a length of " + term.length());
            String newWonderlandAdventures = wonderlandAdventures.toLowerCase().replace(term.toLowerCase(), "");
            System.out.println(newWonderlandAdventures.trim());
        } else {
            System.out.println("The term you searched for was NOT found.");
        }
    }
}
