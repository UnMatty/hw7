package ru.matprojects.stc31.hw.hw7;

import junit.framework.TestCase;

public class MyBestFileReaderTest extends TestCase {
//    private static String TEST_FILE_NAME = "/Users/matvejunesihin/IdeaProjects/hw7/src/test/resources/test.txt";
    private static String TEST_FILE_NAME = "./src/test/resources/test.txt";
    public void testReadFile() {
        MyBestFileReader.printAndRead(TEST_FILE_NAME);
    }
}