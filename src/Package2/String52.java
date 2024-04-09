package Package2;

import java.util.Scanner;

public class String52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Enter a string of Uzbek words separated by spaces: ");
        String res  = capitalizeFirsttext(input);
        System.out.println(res);


    }
    public static String capitalizeFirsttext(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        boolean capitalizeNext = true;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);


            if (Character.isLetter(currentChar) && capitalizeNext) {
                stringBuilder.append(Character.toUpperCase(currentChar));
                capitalizeNext = false;
            } else {
                stringBuilder.append(currentChar);
            }

            if (currentChar == ' ' || currentChar == ':' || currentChar == '\n') {
                capitalizeNext = true;
            }
        }

        return stringBuilder.toString();
    }
}
