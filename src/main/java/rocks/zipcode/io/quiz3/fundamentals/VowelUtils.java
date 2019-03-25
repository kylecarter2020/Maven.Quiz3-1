package rocks.zipcode.io.quiz3.fundamentals;

import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        Boolean result = false;

        for (Character c: word.toCharArray()){
            if(isVowel(c)){
                result = true;
                break;
            }
        }

        return result;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        Integer index = 0;
        if(!hasVowels(word)){
            return -1;
        } else {
            for (Character c : word.toCharArray()) {
                if (isVowel(c)) {
                    return index;
                } else {
                    index++;
                }
            }
            return index;
        }
    }


    public static Boolean startsWithVowel(String word) {
        return isVowel(word.charAt(0));
    }

    public static Boolean isVowel(Character character) {
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
        return vowels.contains(Character.toLowerCase(character));
    }
}