package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        int minLength = Math.min(left.length(),right.length());
        int res = 0;
         for (int i = 0;i<minLength;i++){
                 res = Character.compare(left.charAt(i), right.charAt(i));
                 if (res < 0) {
                     return res;
                 }
         }
        return left.compareTo(right);
    }
}
