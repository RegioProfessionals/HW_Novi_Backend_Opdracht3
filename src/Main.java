import java.util.HashMap;
import java.util.Map;

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
//        // HashMap<Integer, String> Translator.translatorMap = new HashMap<>();
//                  print the returned map
        System.out.println("Main class prints: " + translatorMap1);
//          Condition 5: Here the scanner object;
//        ?? No clue yet what they mean with scanner

//        Condition


    }

}
