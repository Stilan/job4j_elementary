package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class DepartmentsTest {
    @Test
    public void whenMissed() {
        var input = List.of("k1/sk1");
        var  expect = List.of("k1", "k1/sk1");
        var result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenNonChange() {
        var input = List.of("k1", "k1/sk1");
        var  expect = List.of("k1", "k1/sk1");
        var  result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }
}