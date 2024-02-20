
/****************************
 Mallory Pulliam
 Lab #6
*****************************/

import java.io.*;

public class ReadInts {
    // Constructor to read integers from a file
    public ReadInts(String fileName) {
        File newFile = new File(fileName);
        try {
            // Check if the file is not empty
            long size = newFile.length();
            if (size != 0) {
                // Create FileInputStream and DataInputStream
                FileInputStream fin = new FileInputStream(newFile);
                DataInputStream din = new DataInputStream(fin);
                // Read integers from the file and print them
                while (fin.available() > 0) {
                    int x = din.readInt();
                    System.out.println(x);
                }
                // Close the streams
                din.close();
                fin.close();
            }

            else {
                System.out.println("File is empty. Please provide a non-empty file.");
            }
        }

        catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ReadInts ri = new ReadInts("mydata.dat");
    }
}
