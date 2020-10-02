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

        expected = 12.16;
        x1 = 1;
        y1 = 3;
        x2 = -1;
        y2 = -9;
        out =  Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);

        expected = 7.07;
        x1 = 3;
        y1 = 5;
        x2 = -2;
        y2 = 0;
        out =  Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

}