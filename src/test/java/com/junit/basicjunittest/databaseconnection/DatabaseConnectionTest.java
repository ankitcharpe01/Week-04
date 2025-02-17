package com.junit.basicjunittest.databaseconnection;
import com.junit.basicjunittest.databaseconnection.DatabaseConnection;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DatabaseConnectionTest {
    @BeforeEach
    public void setUp() {
        DatabaseConnection.connect();
    }

    @AfterEach
    public void tearDown() {
        DatabaseConnection.disconnect();
    }


    @Test
    public void testConnectionEstablished() {
        assertTrue(DatabaseConnection.isConnected(), "The database should be connected.");
    }

    @Test
    public void testConnectionClosed() {
        DatabaseConnection.disconnect();
        assertFalse(DatabaseConnection.isConnected(), "The database should be disconnected.");
    }

    @Test
    public void testConnectionAndDisconnection() {
        assertTrue(DatabaseConnection.isConnected(), "The database should be connected.");
        DatabaseConnection.disconnect();
        assertFalse(DatabaseConnection.isConnected(), "The database should be disconnected.");
    }

}