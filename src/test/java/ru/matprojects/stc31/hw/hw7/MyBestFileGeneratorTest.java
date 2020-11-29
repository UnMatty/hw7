package ru.matprojects.stc31.hw.hw7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyBestFileGeneratorTest {
    @Test
    void genFilesTest() {
        WordGenerator wg = new WordGenerator();
        String[] wordArray = wg.genWordArray(1000);
        MyBestFileGenerator.getFiles("./", 10, 1000000, wordArray, 5);
    }
}