package ru.matprojects.stc31.hw.hw7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraseGeneratorTest {

    @Test
    void fraseGenTest() {
        FraseGenerator fraseGenerator = new FraseGenerator(new WordGenerator());
        System.out.println(fraseGenerator.genNewFrase());
    }

    @Test
    void fraseWithPr() {
        WordGenerator wordGenerator = new WordGenerator();
        String[] wordArray = wordGenerator.genWordArray(1000);
        FraseGenerator fraseGenerator = new FraseGenerator(wordGenerator, wordArray, 10);
        System.out.println(fraseGenerator.genNewFrase());
    }
}