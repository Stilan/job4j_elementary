package ru.job4j.collection;

import java.util.Comparator;

import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
       int res = Integer.compare(left.length(),right.length());
       if (res > 0){
           right +=" ";
       }else if (res < 0){
           left +=" ";
       }
           for (int i = 0; i < left.length();i++){
               res = Character.compare(left.charAt(i),right.charAt(i));
               if (!(res==0)){
                   return res;
               }
           }
       return res;
    }
}
