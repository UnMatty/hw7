package ru.matprojects.stc31.hw.hw7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextGeneratorTest {
    @Test
    void textGeneratorTest() {
        WordGenerator wordGenerator = new WordGenerator();
        String[] wordArray = wordGenerator.genWordArray(1000);
        TextGenerator textGenerator = new TextGenerator(new FraseGenerator(wordGenerator, wordArray, 10));
        System.out.println(textGenerator.genText(1000000));
    }
}