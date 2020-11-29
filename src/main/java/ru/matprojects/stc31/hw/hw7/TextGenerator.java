package ru.matprojects.stc31.hw.hw7;

import java.util.Random;

public class TextGenerator {
    private static final int MAX_ABZAC_LENGTH = 20;
    private Random random;
    private FraseGenerator fraseGenerator;

    public TextGenerator(FraseGenerator fraseGenerator) {
        this.random = new Random();
        this.fraseGenerator = fraseGenerator;
    }

    public String genAbzac() {
        int l = random.nextInt(MAX_ABZAC_LENGTH);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < l; i++){
            if (i != 0) {
                sb.append(" ");
            }
            sb.append(fraseGenerator.genNewFrase());
        }

        return sb.toString();
    }

    public String genText(int size){
        StringBuilder textSb = new StringBuilder();
        while (textSb.length() < size) {
            if (textSb.length() != 0)
                textSb.append("\n");
            textSb.append(genAbzac());
        }

        return textSb.substring(0, size);
    }
}
