package com.example.filehandling.readandwritetextfile;

public class Main {
    public static void main(String[] args) {
        ReadAndWrite fileHandler = new ReadAndWrite();
        String sourceFile = "D:/CapgeminiTraining/input.txt";
        String destinationFile = "D:/CapgeminiTraining/output.txt";
        fileHandler.copyFile(sourceFile, destinationFile);
    }
}

