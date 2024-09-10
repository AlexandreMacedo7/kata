package br.com.alexandremacedo;

public class FizzBuzz {
    public static void main(String[] args) {

    }
    public String fizzBuzz(int number){
        if(number % 3 == 0){
            return "Fizz";
        }
        return Integer.toString(number);
    }
}