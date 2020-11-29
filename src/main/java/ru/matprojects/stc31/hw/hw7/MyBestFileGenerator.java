package ru.matprojects.stc31.hw.hw7;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyBestFileGenerator {
    public static void getFiles(String path, int n, int size, String[] words, int probability){
        if (n <= 0 || size <= 0)
            return;

        TextGenerator textGenerator = new TextGenerator(new FraseGenerator(new WordGenerator(), words, probability));
        for(int i = 0; i < n; i++) {
            try (FileOutputStream fs = new FileOutputStream(path + "/" + i + ".txt")){
                fs.write(textGenerator.genText(size).getBytes(), 0, size);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
