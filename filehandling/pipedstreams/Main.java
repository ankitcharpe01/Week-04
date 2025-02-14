package com.example.filehandling.pipedstreams;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Main {
        public static void main(String[] args) {
            try {
                PipedOutputStream outputStream = new PipedOutputStream();
                PipedInputStream inputStream = new PipedInputStream(outputStream);

                WriterThread writer = new WriterThread(outputStream);
                ReaderThread reader = new ReaderThread(inputStream);

                writer.start();
                reader.start();
            } catch (IOException e) {
                System.out.println("Piping error: " + e.getMessage());
            }
        }
}