package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String str1 = left.substring(0, left.indexOf("."));
        String str2 = right.substring(0, right.indexOf("."));
        int res1 = Integer.parseInt(str1);
        int res2 = Integer.parseInt(str2);
        return Integer.compare(res1,res2);
    }
}
