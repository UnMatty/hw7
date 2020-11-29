package ru.matprojects.stc31.hw.hw7;

import org.junit.jupiter.api.Test;

public class MyBestFileReaderTest {
//    private static String TEST_FILE_NAME = "/Users/matvejunesihin/IdeaProjects/hw7/src/test/resources/test.txt";
    private static String TEST_FILE_NAME = "./src/test/resources/test.txt";

    @Test
    public void testReadFile() {
        MyBestFileReader.printAndRead(TEST_FILE_NAME);
    }
}