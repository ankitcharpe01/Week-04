package com.example.filehandling.pipedstreams;

import java.io.*;

class WriterThread extends Thread {
    private PipedOutputStream outputStream;

    public WriterThread(PipedOutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                String message = "Message " + i + "\n";
                outputStream.write(message.getBytes());
                outputStream.flush();
                Thread.sleep(500);
            }
            outputStream.close();
        } catch (IOException | InterruptedException e) {
            System.out.println("Writer error: " + e.getMessage());
        }
    }
}

