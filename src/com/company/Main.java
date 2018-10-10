package com.company;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        public static void Guesser(int number)
        {
            Scanner input = new Scanner(System.in);
            int guess;
            double num = Math.random();
            System.out.print("Guess my secret number:  ");
            guess = input.nextInt();
            while (!Objects.equals(guess, number)) {
                System.out.print("Guess again:  ");
                input = new Scanner(System.in);
                guess = input.nextInt();
            }
        }
    }
}
