package kz.thquiet;

import java.util.Scanner;

public class HomeWorkTask2 {
    final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String[] words = {
                "apple", "banana",
                "orange", "pear",
                "pineapple", "watermelon",
                "kiwi" , "lemon",
                "potato", "cherry",
                "pei", "avocado",
                "nut", "olive",
                "melon", "mango",
                "garlic", "carrot",
                "broccoli", "grape",
                "peanut", "leak"
        };
        String randomWord = words[(int) (Math.random() * words.length)];
        System.out.println("Welcome to game!");

        int attemted = 15;
        boolean guessBool = false;
        while(attemted > 0 && !guessBool) {
            System.out.println("Please enter a word: ");
            String userWord = scanner.nextLine().toLowerCase();
            if(userWord.equals(randomWord)) {
                System.out.println("You win in the game!!!");
                guessBool = true;
            }else{
                StringBuilder h = new StringBuilder("###############");
                for (int i = 0; i < randomWord.length(); i++) {
                    if(i<userWord.length() && randomWord.charAt(i) == userWord.charAt(i)) {
                       h.setCharAt(randomWord.charAt(i) , userWord.charAt(i));
                    }
                }
                System.out.println(h);
                attemted--;
                System.out.println("Alas, you did not guess.");
            }
        }
//        while(attemted > 0 && !guessBool) {
//            System.out.println("Please enter a word: ");
//            String userWord = scanner.nextLine().toLowerCase();
//            if(userWord.equals(randomWord)) {
//                System.out.println("You win in the game!!!");
//                guessBool = true;
//            }else{
//                StringBuilder h = new StringBuilder();
//                for (int i = 0; i < randomWord.length(); i++) {
//                    if(i<userWord.length() && randomWord.charAt(i) == userWord.charAt(i)) {
//                        h.append(userWord.charAt(i));
//                    }else{
//                        h.append("#");
//                    }
//                }
//                System.out.println(h);
//                attemted--;
//                System.out.println("Alas, you did not guess.");
//            }
//        }
        if (!guessBool){
            System.out.println("You are not find secret word, is correct word:" + randomWord);
        }
        scanner.close();
    }
}
