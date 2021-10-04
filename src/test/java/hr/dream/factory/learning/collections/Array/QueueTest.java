package hr.dream.factory.learning.collections.Array;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    @Test
    public void add() {
        Queue s = new Queue(10);
        s.add("kurcina");
        s.add("kurcina2");
        s.add("kurcina3");
        s.add("kurcina4");
        s.add("kurcina5");
        s.add("kurcina6");
        s.add("kurcina7");
        s.add("kurcina8");
        s.add("kurcina9");
        s.add("kurcina10");
        //s.add("kurcina10");
        assertEquals(10, s.size());
    }

    @Test
    public void remove() {
        Queue s = new Queue(10);
        s.add("kurcina");
        s.add("kurcina2");
        s.add("kurcina3");
        s.add("kurcina4");
        s.remove("kurcina");
    }

    @Test
    public void dequeue() {
    }

    @Test
    public void size() {
    }
}