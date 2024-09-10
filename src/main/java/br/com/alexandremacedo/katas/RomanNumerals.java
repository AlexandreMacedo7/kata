package br.com.alexandremacedo.katas;

public class RomanNumerals {

    public String integerToRoman(int number) {
        if(number == 1){
            return "I";
        }else if (number == 4){
            return "IV";
        }else if(number == 9){
            return "IX";
        }
        return Integer.toString(number);
    }
}
