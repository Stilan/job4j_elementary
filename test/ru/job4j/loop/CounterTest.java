package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void sumByEven() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void sumByEven2() {
        int rsl = Counter.sumByEven(6, 10);
        int expected = 24;
        assertThat(rsl, is(expected));
    }
}