package ru.job4j.collection;

import java.util.HashSet;
import java.util.Set;

public class Article {

    public static boolean generateBy(String origin, String line) {
        Set<String> text = new HashSet<>();
        origin = origin.replaceAll("[^A-Za-zА-Яа-я0-9]", " ");
        line = line.replaceAll("[^A-Za-zА-Яа-я0-9]", " ");
        String[] stringsText = origin.split(" ");
        String[] stringsTextLine = line.split(" ");
        for (String words : stringsText) {
            text.add(words);
        }
        for (String words : stringsTextLine) {
            if (text.add(words)) {
                return false;
            }
        }
        return true;
    }
}
