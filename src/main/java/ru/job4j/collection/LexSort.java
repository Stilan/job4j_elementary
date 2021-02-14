package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        var str1 = left.substring(0, left.indexOf("."));
        var str2 = right.substring(0, right.indexOf("."));
        Integer res1 = Integer.parseInt(str1);
        Integer res2 = Integer.parseInt(str2);
        System.out.println(res1.compareTo(res2));
        return res1.compareTo(res2);
    }
}
