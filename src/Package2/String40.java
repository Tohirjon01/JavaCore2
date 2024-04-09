package Package2;

import java.util.Scanner;

public class String40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String result = controlQuestionMarks(word);

        System.out.println("Result:");
        System.out.println(result);
    }

    public static String controlQuestionMarks(String input) {
        int firstMarkIndex = input.indexOf('?');
        int lastMarkIndex = input.lastIndexOf('?');


        if (firstMarkIndex == lastMarkIndex && firstMarkIndex == -1) {
            return "";
        }


        StringBuilder sb = new StringBuilder(input);
        if (firstMarkIndex != -1) {
            sb.setCharAt(firstMarkIndex, '!');
        }
        if (lastMarkIndex != -1) {
            sb.setCharAt(lastMarkIndex, '!');
        }

        return sb.toString();
    }
}

