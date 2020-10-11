package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] input  = {5, 4, 3, 2};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas5Then2() {
        int[] input  = {3, 6, 7, 223, 4};
        int value = 7;
        int result = FindLoop.indexOf(input, value);
        int expect = 2;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas5Then3() {
        int[] input  = {3, 6, 7, 223, 4};
        int value = 4;
        int result = FindLoop.indexOf(input, value);
        int expect = 4;
        assertThat(result, is(expect));
    }
    @Test
    public void whenFind3() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 4;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 4;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind4() {
        int[] input = new int[] {5, 2, 10, 2, 4, 6, 3};
        int value = 3;
        int start = 2;
        int finish = 6;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 6;
        assertThat(result, is(expect));
    }
}