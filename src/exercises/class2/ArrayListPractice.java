package exercises.class2;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String[] args)
    {
        ArrayList<Integer> referenceList = new ArrayList<>();
        for(int i = 0; i < 10; i++)
        {
            referenceList.add(i);
        }

        System.out.println(sumEvenNumbers(referenceList));

        String alicePassage = "I would not, could not, in a box. I would not, could not with a fox." +
                " I will not eat them in a house. I will not eat them with a mouse";

        printListWords(alicePassage);

    }

    public static int sumEvenNumbers(ArrayList<Integer> arrayList)
    {
        int sum = 0;
        for(int i = 0; i < arrayList.size(); i++)
        {
            if(arrayList.get(i) % 2 == 0)
            {
                sum = (arrayList.get(i) + sum);
            }
        }
        return sum;
    }

    public static void printListWords(String str)
    {
        Scanner input = new Scanner(System.in);
        String strArray[] = str.split(" |,|\\.");
        List<String> stringList = new ArrayList<>();
        stringList = Arrays.asList(strArray);

        System.out.println("What length of words would you like to print? ");
        int letterCount = input.nextInt();

        for(String s : stringList)
        {
            if(s.length() == letterCount)
            {
                System.out.println(s);
            }
        }
    }
}
