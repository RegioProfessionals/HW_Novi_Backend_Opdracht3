import java.util.HashMap;
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
        }
        else {
            System.out.println("The array of both key and value is " + keyArraySize + " items long.");
        }

//              Condition7: Hashmap variable
//              Develop a new HashMap with the types of both arrays (Integer) and (String)
        HashMap<Integer, String> translatorMap = new HashMap<Integer, String>();

//        Fill the new Hashmap variable with the keys and values from the arrays
        int i = 0;
        while (i<keyArraySize) {
            translatorMap.put(keyArray[i], valueArray[i]);
            i++;
            System.out.println("Translator-class prints: " + translatorMap);
        }
//        Condition9: Translate function/method
//        This means: get the key (input), check if key is present,
//        if present return value connected to the key into a variable
//        Next step would be to deliver variable

        // Get the key (input)

        //  check the key
        if (translatorMap.containsKey(0)) {
            String mapValue;
            // searching the map and return the value to the variable
            mapValue = translatorMap.get(0);
            System.out.println("The alphabetical-name corresponding to the number " + keyArray[0] + " is " + mapValue);
        }

        return translatorMap;



    }
}




