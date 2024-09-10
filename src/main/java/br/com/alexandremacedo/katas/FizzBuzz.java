package br.com.alexandremacedo.katas;

public class FizzBuzz {
    public String fizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "Main";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        }
        return Integer.toString(number);
    }
}
