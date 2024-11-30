import java.util.HashMap;
import java.util.Scanner;

//              Condiiton6: 1 Translator class
public class Translator {


    int keyArraySize;
    int valueArraySize;


    //              Condition8: Constructor with 2 arrays
    public static HashMap translatorMap(Integer[] keyArray, String[] valueArray) {


        //      Determine the size of both arrays needed for the while-loop
        int keyArraySize = keyArray.length;
        int valueArraySize = valueArray.length;
        //      Determine if both arrays are of the same length, if not:
        if (keyArraySize != valueArraySize) {
            throw new IllegalArgumentException("Number of keys and number of values don't match.");
        }
//              Determine if the array is empty
        else if (keyArraySize == 0) {
            return new HashMap();
        } else {
            System.out.println("The array of both key and value is " + keyArraySize + " items long.");
        }

//              Condition7: Hashmap variable translatorMap
//              Develop a new HashMap with the types of both arrays (Integer) and (String)
        HashMap<Integer, String> translatorMap = new HashMap<Integer, String>();

//        Fill the new Hashmap variable with the keys and values from the arrays
        int i = 0;
        while (i < keyArraySize) {
            translatorMap.put(keyArray[i], valueArray[i]);
            i++;
            System.out.println("Translator-class prints: " + translatorMap);
        }
//        Condition9: Translate function/method
//        This means: get the key (input), assign the key to a variable,
//        check if key is present, if present return value connected to the key


//
//        Get the key (input from user so ask a question)
        System.out.println("What number between 0 and 9 do you want me to translate?");
        Scanner inputUser = new Scanner(System.in);
//        assign key to variable, the key is the input from the user
        int input1 = 0; // declare the variable and give it a value
        input1 = inputUser.nextInt();
//        check the key
        if (translatorMap.containsKey(input1)) {
            String mapValue;
//        searching the map and return the value to the variable
            mapValue = translatorMap.get(input1);
            System.out.println("The alphabetical-name corresponding to the number " + input1 + " is " + mapValue + ".");
        } else {
            System.out.println("The number you gave me is not in between 0 and 9.");
        }


        return translatorMap;

    }
}


