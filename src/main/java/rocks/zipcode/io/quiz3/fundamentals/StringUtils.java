package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        StringBuilder stringBuilder = new StringBuilder(str);

        return stringBuilder.replace(indexToCapitalize, indexToCapitalize+1, str.toUpperCase().charAt(indexToCapitalize)+"").toString();
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return (baseString.charAt(indexOfString) == characterToCheckFor);
    }

    public static String[] getAllSubStrings(String string) {
        //Integer length = getNumberOfSubStrings(string);
        StringBuilder newStr = new StringBuilder();
        String[] subStrings; //= new String[length];
        //Integer subStringArrayIndex = 0;

        for (int i = 0; i < string.length(); i++) {
            for (int j = i+1; j <= string.length(); j++) {
                newStr.append(string.substring(i, j) +  "\n");
            }
        }
        subStrings = newStr.toString().split("\n");
        return removeDuplicates(subStrings);
    }

    private static String[] removeDuplicates(String[] subStrings) {
        List<String> results = new ArrayList<>();
        for (String s : subStrings) {
            if(!results.contains(s)){
                results.add(s);
            }
        }
        return (results).toArray(new String[0]);
    }

    public static Integer getNumberOfSubStrings(String input){
        Integer numberOfSubstrings = 0;

        for (int i = 0; i < input.length()-1; i++) {
            numberOfSubstrings = getSubstringsForCharacter(input, numberOfSubstrings, i);
        }
        return numberOfSubstrings;
    }

    private static Integer getSubstringsForCharacter(String input, Integer numberOfSubstrings, int i) {
        for (int j = i+1; j <= input.length(); j++) {
            numberOfSubstrings++;
        }
        return numberOfSubstrings;
    }
}