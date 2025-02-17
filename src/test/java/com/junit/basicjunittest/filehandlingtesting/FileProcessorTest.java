package com.junit.basicjunittest.filehandlingtesting;
import com.junit.basicjunittest.filehandlingtesting.FileProcessor;
import org.junit.jupiter.api.*;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

public class FileProcessorTest {

    private static final String TEST_FILE = "testfile.txt";

    @BeforeEach
    public void setUp() throws IOException {
        File file = new File(TEST_FILE);
        if (file.exists()) {
            file.delete();
        }
    }

    @Test
    public void testWriteAndReadFromFile() throws IOException {
        String content = "Hello, world!";
        FileProcessor.writeToFile(TEST_FILE, content);
        String readContent = FileProcessor.readFromFile(TEST_FILE);
        assertEquals(content, readContent);
    }

    @Test
    public void testFileExistsAfterWriting() throws IOException {
        String content = "Test content";
        FileProcessor.writeToFile(TEST_FILE, content);
        File file = new File(TEST_FILE);
        assertTrue(file.exists());
    }

    @Test
    public void testIOExceptionWhenFileDoesNotExist() {
        assertThrows(IOException.class, () -> {
            FileProcessor.readFromFile("nonexistentfile.txt");
        });
    }
}
