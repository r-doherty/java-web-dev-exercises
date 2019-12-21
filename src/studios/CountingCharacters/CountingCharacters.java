package studios.CountingCharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import studios.CountingCharacters.DataFile;

public class CountingCharacters extends DataFile {

    public static void main(String[] args)
    {
        // Creating HashMap outlay for counting characters, index removed in favor of bonus mission — pulling in value from other file.
        HashMap<Character, Integer> charCountIndex = new HashMap<>();
//        Scanner input = new Scanner(System.in);
//        System.out.print("Please enter a String / Phrase... ");

        // Calling in reference to DataFile.java file to pull in String
        DataFile fileReference = new DataFile();
        String reference =  fileReference.referenceData;

        // set all to lower case in order to make case insensitive, map characters to array
        reference = reference.toLowerCase();
        char[] charactersInString = reference.toCharArray();

        // loop through all characters populated into array — if they are non-alpha — kick them out
        for(char c : charactersInString)
        {
            if(Character.isAlphabetic(c))
            {
                // If HashMap already contains a key for character 'c' -- up the count / value for that key by +1
                if(charCountIndex.containsKey(c))
                {
                    charCountIndex.put(c, charCountIndex.get(c)+1);
                }
                // Establish / initialize Key + Value = 1 for HashMap on first occurrence of char 'c'
                else
                {
                    charCountIndex.put(c, 1);
                }
            }
        }

        // Loop through Hash Map to print out keys and values accordingly, onto a single line per set.
        for (Map.Entry<Character, Integer> index : charCountIndex.entrySet()) {
            System.out.println(index.getKey() + ": " + index.getValue());
        }
    }

}
