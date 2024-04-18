package kz.thquiet;

import java.util.Scanner;

public class HomeWork {
    static Scanner scanner = new Scanner(System.in);
    public static void main( String[] args ) {
        int attempt = 3;
        int min = 1;
        int max = 9;
        int randomNumber  = (int) Math.random() * (max - min) + min;
        while(attempt > 0) {
            System.out.println("Your attemtp answers: "+ attempt);
            System.out.println("Write your correct answer to your number: ");
            int number = scanner.nextInt();
            if (checkNumber(randomNumber, number) == true){
                System.out.println("You win the game!");
                break;
            } else {
                System.out.println("Your answer is incorrect!");
                attempt--;
            }
        }
        if (attempt == 0) {
            System.out.println("You lose in the game");
        }
    }
    private static boolean checkNumber(int randomNumber, int number) {
        if (randomNumber == 0 && number == 0) {
            return false;
        }
        if (randomNumber == number) {
            return true;
        }else {
            return false;
        }
    }
}
