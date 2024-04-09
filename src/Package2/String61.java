package Package2;

import java.util.Scanner;

public class String61 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the full file path:");

        String filePath = scanner.nextLine();
        String firstDirectoryName = exactlastname(filePath);

        System.out.println("First directory name: " + firstDirectoryName);
        //  D:\Qudrat Abdurahimowbooks\books\java_books.exe

    }

    public static String exactlastname(String filepath){
        String[] parts = filepath.split("\\\\");

        String lastpathname = parts[parts.length - 2];
        if (lastpathname.isEmpty()){
            return "\\";

        }else {
            return lastpathname;

        }
    }
}
