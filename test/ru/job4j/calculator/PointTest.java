package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance() {
        double expected = 2;

        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;

        double out = Point.distance(x1, y1, x2, y2);

        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance2() {
        double expected = 12.16;

        int x1 = 1;
        int y1 = 3;
        int x2 = -1;
        int y2 = -9;

        double out = Point.distance(x1, y1, x2, y2);

        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3() {
        double expected = 7.07;

        int x1 = 3;
        int y1 = 5;
        int x2 = -2;
        int y2 = 0;

        double out = Point.distance(x1, y1, x2, y2);

        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance4() {
        double expected = 20.24;

        int x1 = 8;
        int y1 = 8;
        int x2 = -3;
        int y2 = -9;

        double out = Point.distance(x1, y1, x2, y2);

        Assert.assertEquals(expected, out, 0.01);
    }
}