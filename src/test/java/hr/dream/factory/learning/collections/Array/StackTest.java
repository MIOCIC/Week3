package hr.dream.factory.learning.collections.Array;

import hr.dream.factory.learning.collections.BaseCollection;
import org.junit.Test;
import org.junit.function.ThrowingRunnable;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void add() {
        Stack s = new Stack(10);
        s.push("kurcina");
        s.push("kurcina2");
        s.push("kurcina3");
        s.push("kurcina4");
        s.push("kurcina5");
        s.push("kurcina6");
        s.push("kurcina7");
        s.push("kurcina8");
        s.push("kurcina9");
        s.push("kurcina10");
        //s.push("kurcina10");
        assertEquals(10, s.size());

        assertThrows(FullStackException.class,
                () -> s.add("test")
        );
    }

    @Test
    public void push() {
    }

    @Test
    public void remove() {
        Stack s = new Stack(10);
        s.push("kurcina");
        s.push("kurcina2");
        assertEquals(2, s.size());
        s.remove("kurcina");
        assertEquals(1, s.size());

        for (int i = 0; i <9; i++) {
            s.push("kita");
        }
        assertEquals(10, s.size());
        s.remove("kita");
        assertEquals(1, s.size());
    }
}