package rocks.zipcode.io.quiz3.fundamentals;

import static rocks.zipcode.io.quiz3.fundamentals.VowelUtils.*;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String s : words) {
            s = evaluateWord(str, s);
            result.append(s + " ");
        }
        return result.toString().trim();
    }

    private String evaluateWord(String str, String s) {
        if (!isAlphaString(str)) {
            s = null;
        } else if (!hasVowels(str)) {
            s = s + "ay";
        } else {
            s = generatePigLatin(s);
        }
        return s;
    }

    private String generatePigLatin(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);

        if (isVowel(str.charAt(0))) {
            stringBuilder.append("way");
        } else {
            Integer endingIndex = getIndexOfFirstVowel(str);

            stringBuilder.replace(0, endingIndex, "");
            stringBuilder.append(str.substring(0, endingIndex) + "ay");
        }

        return stringBuilder.toString();
    }

    public static Boolean isAlphaString(String string) {
        return (string.matches("^[ A-Za-z]+$"));
    }
}