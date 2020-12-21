package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PriorityQueueTest {

    @Test
    public void put() {
        PriorityQueue queue = new PriorityQueue();

        queue.put(new Task("low", 3));
        queue.put(new Task("middle", 5));
        queue.put(new Task("urgent", 1));
        Task result = queue.take();
        assertThat(result.getDesc(), is("urgent"));
    }
}