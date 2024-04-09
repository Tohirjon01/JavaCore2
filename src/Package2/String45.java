package Package2;

import java.util.Scanner;

public class String45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string of Uzbek words separated by spaces:");

        String input = scanner.nextLine();
        String[] words = input.split("\\s+");

        String shortestWord = findShortestWord(words);
        int shortestLength = shortestWord.length();

        System.out.println("Shortest word is : " + shortestWord);
        System.out.println("Shortest word length is : " + shortestLength);
    }

    public static String findShortestWord(String[] words) {
        String shortest = words[0];

        for (String word : words) {
            if (word.length() < shortest.length()) {
                shortest = word;
            }
        }

        return shortest;
    }
}

