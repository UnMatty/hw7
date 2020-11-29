package ru.matprojects.stc31.hw.hw7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WordGeneratorTest {
    private WordGenerator wordGenerator;

    @BeforeEach
    void setUp() {
        wordGenerator = new WordGenerator();
    }

    @Test
    public void wordGenTest() {
        String genWord = wordGenerator.genWord();
        int l = genWord.length();
        assertTrue(l < 15);
        assertTrue(Character.isLowerCase(genWord.charAt(0)));
    }

    @Test
    void UpperCaseWordGenTest() {
        String genWord = wordGenerator.genUpperWord();
        int l = genWord.length();
        assertTrue(l < 15);
        assertTrue(Character.isUpperCase(genWord.charAt(0)));
    }

    @Test
    void arrGenTest() {
        String[] arrWords = wordGenerator.genWordArray(15);
        assertNotNull(arrWords);
        assertEquals(15, arrWords.length);
    }
}