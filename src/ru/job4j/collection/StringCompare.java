package ru.job4j.collection;

import java.util.Comparator;

import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
       int res = 0;
       int minLength = Math.min(left.length(), right.length());
           for (int i = 0; i < minLength;i++){
               res = Character.compare(left.charAt(i),right.charAt(i));
               if (res!=0){
                   return res;
               }
           }

        return Integer.compare(left.length(),right.length());
    }
}
