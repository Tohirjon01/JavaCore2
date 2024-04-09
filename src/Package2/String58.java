package Package2;

import java.util.Scanner;

public class String58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the full file name: ");

        String filename = scanner.nextLine();
        String fileName = extractFileName(filename);

        System.out.println("File name (without extension): " + fileName);
    }

    public static String extractFileName(String filePath) {

        int lastBackslashIndex = filePath.lastIndexOf('\\');


        int lastDotIndex = filePath.lastIndexOf('.');


        String fileName = filePath.substring(lastBackslashIndex + 1, lastDotIndex);

        return fileName;
    }
}
