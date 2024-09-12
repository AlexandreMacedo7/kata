package br.com.alexandremacedo.katas;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumerals {


    private static final Map<Integer, String> romanMap = new LinkedHashMap<>();

    static {
        romanMap.put(9,"IX");
        romanMap.put(5, "V");
        romanMap.put(4, "IV");
        romanMap.put(1, "I");
    }

    public String integerToRoman(int number) {

        StringBuilder result = new StringBuilder();

        for (Map.Entry<Integer, String> entry : romanMap.entrySet()) {
            while (number >= entry.getKey()) {
                result.append(entry.getValue());
                number -= entry.getKey();
            }
        }
        return result.toString();
    }
}
