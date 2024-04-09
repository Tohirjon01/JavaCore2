package Package2;

import java.util.Scanner;

public class String60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the full file path:");

        String filePath = scanner.nextLine();
        String firstDirectoryName = firstdirectoryname(filePath);

        System.out.println("First directory name: " + firstDirectoryName);
        // D:\Qudrat Abdurahimowbooks\My book.exe

    }

    public static String firstdirectoryname(String filename) {
        String[] part = filename.split("\\\\");
        String directoryname = part.length > 1 ? part[1] : filename;
        return directoryname;
    }
}
