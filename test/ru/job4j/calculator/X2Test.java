package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class X2Test {

    @Test
    public void calc() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;

        int expected = 3;

        int rsl = X2.calc(a, b, c, x);

        Assert.assertEquals(expected, rsl);

         a = 0;
         b = 1;
         c = 1;
         x = 1;

         expected = 2;

         rsl = X2.calc(a, b, c, x);

        Assert.assertEquals(expected, rsl);

        a = 1;
        b = 1;
        c = 0;
        x = 1;

        expected = 2;

        rsl = X2.calc(a, b, c, x);

        Assert.assertEquals(expected, rsl);

        a = 1;
        b = 1;
        c = 1;
        x = 0;

        expected = 1;

        rsl = X2.calc(a, b, c, x);

        Assert.assertEquals(expected, rsl);

    }
}