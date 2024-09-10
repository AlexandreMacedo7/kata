package br.com.alexandremacedo.katas;

public class FizzBuzz {
    public String fizzBuzz(int number) {

        if (number == 0) {
            return "Number zero";
        } else if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else if (number < 0) {
            return "Number negative";
        }
        return Integer.toString(number);
    }
}
