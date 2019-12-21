package exercises.class2;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args)
    {
        int[] values = {1, 1, 2, 3, 5, 8};
        String reference = "I would not, could not, in a box. I would not, could not with a fox." +
                " I will not eat them in a house. I will not eat them with a mouse";

        for(int i = 0; i < values.length; i++)
        {
            if(values[i] % 2 != 0)
            {
                System.out.println(values[i]);
            }
        }

        String[] referenceSentenceArray = reference.split(" ");
        System.out.println(Arrays.toString(referenceSentenceArray));


        String[] referenceWordArray = reference.split("\\.");
        System.out.println(Arrays.toString(referenceWordArray));
    }
}
