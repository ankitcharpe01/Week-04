package com.exceptionhandling.checkedexception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HandleCheckedException {

    public static void readAFile(String filePath) {
        // Create a FileReader object to read from the file
        try(BufferedReader br = new BufferedReader(new FileReader(filePath));
            ){
            String line;
            // Use a loop to read each line using the readLine() method
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException fileNotFound) {
            System.out.println("File not found! (can't open file): " + fileNotFound.getMessage());
        } catch (IOException ex) {
            System.out.println("Error while reading the file: "+ex.getMessage());
        }
    }
}


