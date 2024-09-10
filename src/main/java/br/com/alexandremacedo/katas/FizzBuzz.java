package br.com.alexandremacedo.katas;

public class FizzBuzz {
    public String fizzBuzz(int number) {
        if (number < 0) {
            if (number % 3 == 0 && number % 5 == 0) {
                return "FizzBuzz";
            } else if (number % 3 == 0) {
                return "Fizz";
            } else if (number % 5 == 0) {
                return "Buzz";
            }
            return "Number negative";
        }else if (number == 0){
            return "Number zero";
        }
        return Integer.toString(number);
    }
}
