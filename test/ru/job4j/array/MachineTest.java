package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MachineTest {

    @Test
    public void whenEquals() {
        Machine machine = new Machine();
        int[] expected = {};
        int[] rsl = machine.change(100, 100);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when50by35() {
        Machine machine = new Machine();
        int[] expected = {10, 5};
        int[] rsl = machine.change(50, 35);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when50by36() {
        Machine machine = new Machine();
        int[] expected = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 5 };
        int[] rsl = machine.change(150, 35);
        assertThat(rsl, is(expected));
    }
}