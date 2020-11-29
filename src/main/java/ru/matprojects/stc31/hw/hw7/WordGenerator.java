package ru.matprojects.stc31.hw.hw7;

import java.util.Random;

public class WordGenerator {
    private static int WORD_MAX_SIZE = 15;
    private Random random;

    public WordGenerator() {
        this.random = new Random();
    }

    public String genWord() {
        int l = random.nextInt(WORD_MAX_SIZE) + 1;
        char[] word = new char[l];
        for (int i = 0; i < l; i++) {
            word[i] = (char)('a' + random.nextInt(26));
        }

        return new String(word).trim();
    }

    public String genUpperWord() {
        char[] wordArr = genWord().toCharArray();
        wordArr[0] = Character.toUpperCase(wordArr[0]);
        return new String(wordArr);
    }

    public String[] genWordArray(int size) {
        String[] wordArr = new String[size];
        for (int i = 0; i < size; i++){
            wordArr[i] = genWord();
        }

        return wordArr;
    }
}
