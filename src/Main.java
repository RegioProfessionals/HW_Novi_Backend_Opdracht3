import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//          Condition1: Here the numerical array
        Integer[] keyArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//          Condition2: Here the alphabetical array
        String[] valueArray = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
//          Condition 3: Here the boolean variable
        boolean nameBoolean; // I see no need for a boolean variable. While-function doesn't need to store the boolean
//          Condition 4: Here the Translator object;
        HashMap translatorMap1 = Translator.translatorMap(keyArray, valueArray);
        System.out.println("Main class prints: " + translatorMap1);
        // condition 11: They ask me to put the while loop here in the main.
        // Originally I developed the code in the Translator class to keep the main
//         as clean as possible. But ok, we can do that.
        int i = 0;
        while (i < keyArray.length) {
            translatorMap1.put(keyArray[i], valueArray[i]);
            i++;
            // we will print each step to make sure that we can check the proces
            System.out.println("Makin-class prints: " + translatorMap1);
            // see comments at the bottum of the Main-class
        }
//          Condition 5: Here the scanner object;
//        ?? No clue yet what they mean with scanner
//        After some search: So, the scanner is the function that asks the user to give the input


        Scanner inputUser = new Scanner(System.in);
        int input1 = 0;
        System.out.println("What number between 0 and 9 do you want me to translate?");
        input1 = inputUser.nextInt();
        System.out.println("The number you gave me is: " + input1 + " and the translation is " + translatorMap1.get(input1) + ".");

        //     You see a difference in the output when you compare the printed items of
//        Main-class and Translator-class. In Translator-class the hashMap is filled
//        one iteration at the time during the while loop, while in Main-class the
//        HashMap is directly filled with both whole arrays. This means that the
//        while-loop is unnecessary. The while loop is overwriting the same information
//        already stored in translatorMap1. You can immediately ask the user for
//        the key and search tranlatorMap1 for the value.

    }
}