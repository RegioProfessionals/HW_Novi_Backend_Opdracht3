import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//          Condition1: Here the numerical array
        Integer[] keyArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//          Condition2: Here the alphabetical array
        String[] valueArray = {"zero", "one", "two", "Three", "four", "five", "six", "seven", "eight", "nine"};
//          Condition 3: Here the boolean variable
        boolean nameBoolean;
//          Condition 4: Here the Translator object;
        Map translatorMap1 = Translator.translatorMap(keyArray, valueArray);
        System.out.println("Main class prints: " + translatorMap1);
//          Condition 5: Here the scanner object;
//        ?? No clue yet what they mean with scanner
//        After some search: So, the scanner is the function that asks the user to give the input


        Scanner inputUser = new Scanner(System.in);
        int input1 = 0;
        System.out.println("What number between 0 and 9 do you want me to translate?");
        input1 = inputUser.nextInt();
        System.out.println("The number you gave me is: " + input1 + " and the translation is " + translatorMap1.get(input1)+ ".");
    }


}
