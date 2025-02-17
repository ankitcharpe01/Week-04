package com.junit.basicjunittest.databaseconnection;

public class DatabaseConnection {

    private static boolean isConnected; // Static variable to track connection state

    // Static method to simulate connecting to a database
    public static void connect() {
        if (!isConnected) {
            isConnected = true;
            System.out.println("Database connected.");
        } else {
            System.out.println("Already connected to the database.");
        }
    }

    // Static method to simulate disconnecting from the database
    public static void disconnect() {
        if (isConnected) {
            isConnected = false;
            System.out.println("Database disconnected.");
        } else {
            System.out.println("No active connection to disconnect.");
        }
    }

    // Static method to check if the database is connected
    public static boolean isConnected() {
        return isConnected;
    }
}
