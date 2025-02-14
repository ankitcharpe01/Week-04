package com.exceptionhandling.autoclosingresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    public static void readAFile(String filePath) {
        //Use try-with-resources to ensure the file is automatically closed after reading
        try (BufferedReader br = new BufferedReader(new FileReader(filePath));
        ) {
            String line;
            line = br.readLine();
            System.out.println(line);
        } catch (IOException ex) {
            System.out.println("Error while reading the file: " + ex.getMessage());
        }
    }
}