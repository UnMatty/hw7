package ru.matprojects.stc31.hw.hw7;

import java.io.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MyBestFileReader {
    public static void printAndRead(String filePath) {
        Set<String> uniqStr = new HashSet<>();
        try (Scanner scanner = new Scanner(new File(filePath))){
            while (scanner.hasNextLine()) {
                for (String s : scanner.nextLine().split(" ")) {
                    uniqStr.add(s);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(uniqStr.size());
        for (String s : uniqStr) {
            System.out.println(s);
        }
    }
}
