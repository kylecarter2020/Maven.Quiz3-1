package rocks.zipcode.io.quiz3.arrays;

import rocks.zipcode.io.quiz3.fundamentals.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        List<String> result = new ArrayList<>();
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if(!(str.charAt(i) == ' ' ||  str.charAt(i) == '!'||  str.charAt(i) == '_' ||  str.charAt(i) == '0')){
                result.add(StringUtils.capitalizeNthCharacter(str, i));
            }
        }
        return result.toArray(new String[0]);
    }
}
