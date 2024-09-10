package br.com.alexandremacedo.katas;

public class RomanNumerals {

    public String integerToRoman(int number) {
        if(number == 1){
            return "I";
        }
        return Integer.toString(number);
    }
}
