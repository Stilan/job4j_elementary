package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class LexSortTest {
    @Test
    public void sortNum1and2and10() {
        String[] input = {
                "12. Task.",
                "7.1.2. Task.",
                "1. Task."
        };
        String[] out = {
                "1. Task.",
                "7.1.2. Task.",
                "12. Task."
        };
        Arrays.sort(input, new LexSort());
        assertThat(input, is(out));
    }
}