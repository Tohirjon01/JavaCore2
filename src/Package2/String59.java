package Package2;

import java.util.Scanner;

public class String59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the full file name:");

        String fileName = scanner.nextLine();
        String extension = deleteextension(fileName);

        if (extension != null) {
            System.out.println("File extension: " + extension);
        } else {
            System.out.println("No file extension found.");
        }
    }

    public static String deleteextension(String filename) {
        int lastindexdot = filename.lastIndexOf('.');
        if (lastindexdot != -1  && lastindexdot<filename.length() - 1){

            String extension = filename.substring(lastindexdot+1);
            return extension;
        }
        return null;
    }

}
