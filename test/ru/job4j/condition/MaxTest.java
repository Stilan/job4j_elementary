package ru.job4j.condition;

import org.junit.Test;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void max() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void max2() {
        int result = Max.max(3, 2);
        assertThat(result, is(3));
    }
    @Test
    public void max3() {
        int result = Max.max(2, 2);
        assertThat(result, is(2));
    }

}