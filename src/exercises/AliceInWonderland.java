package exercises;

import java.util.Scanner;

public class AliceInWonderland {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String aliceReference = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures" +
                " or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?";

        System.out.println("Please enter a word: ");
        String userInput = input.nextLine();
        if (aliceReference.toLowerCase().contains(userInput.toLowerCase())) {
            System.out.println("The word " + userInput + " was found in the first sentence of Alice in Wonderland! :) ");
        } else {
            System.out.println("The word " + userInput + " was not found in the first sentence of Alice in Wonderland... :( ");
        }
    }

}
