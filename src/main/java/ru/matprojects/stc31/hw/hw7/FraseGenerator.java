package ru.matprojects.stc31.hw.hw7;

import java.util.Random;

public class FraseGenerator {
    private static final int MAX_FRASE_LENGTH = 15;
    private static char[] END_SIMBOLS = {'.', '!', '?'};

    private WordGenerator wordGenerator;
    private Random random;
    private int probability;
    private String[] words;

    public FraseGenerator(WordGenerator wordGenerator, String[] words, int probability) {
        this.wordGenerator = wordGenerator;
        this.random = new Random();
        this.words = words;
    }

    public FraseGenerator(WordGenerator wordGenerator) {
        this.wordGenerator = wordGenerator;
        random = new Random();
        probability = 0;
    }

    private boolean isLucky(){
        if (probability == 0)
            return false;

        return Math.abs(random.nextGaussian()) < 1 / probability;
    }

    private String[] genWordArray(int size) {
        String[] wordArr = wordGenerator.genWordArray(size);
        for (int i = 0; i < size; i++){
            if (isLucky())
                wordArr[i] = words[random.nextInt(words.length - 1)];
        }

        return wordArr;
    }

    public String genNewFrase(){
        int l = random.nextInt(MAX_FRASE_LENGTH)+1;
        StringBuilder sb = new StringBuilder();
        String[] wordArr = genWordArray(l - 1);
        sb.append(wordGenerator.genUpperWord());

        for (String s : wordArr) {
            sb.append(" ")
                        .append(s);
        }

        sb.append(END_SIMBOLS[random.nextInt(3)]);
        return sb.toString();
    }
}
