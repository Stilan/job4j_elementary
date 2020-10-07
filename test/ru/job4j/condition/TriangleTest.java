package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void exist() {
        boolean result = Triangle.exist(2.0, 2.0, 2.0);
        assertThat(result, is(true));
    }

    @Test
    public void exist2() {
        boolean result = Triangle.exist(2.0, 6.0, 2.0);
        assertThat(result, is(false));
    }
}