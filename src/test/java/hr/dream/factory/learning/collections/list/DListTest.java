package hr.dream.factory.learning.collections.list;

import hr.dream.factory.learning.collections.WrongElementException;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class DListTest {

    @Test
    @Ignore
    public void add() {
        DList lista = new DList();
        lista.add("kita");
    }

    @Test
    public void remove() {
        String first = "testing";
        //DList listtest = new DList(null);
        //listtest.remove(first);
        DList listt = new DList();
        listt.add("5");
        listt.add("7");
        listt.add("8");
        String toRemove = "9";
        listt.add(toRemove);
        System.out.println(listt.print());
        listt.remove(toRemove);
        System.out.println(listt.print());

    }

    @Test
    public void size() {
        String first = "testing";
        DList listtest = new DList();
        listtest.add(first);
        int size = listtest.size();
        assertEquals(1,size);
        assertEquals(0, new DList().size());

        listtest.add("2");
        listtest.add("3");
        listtest.add("4");
        listtest.add("2");
        listtest.add("2");
        listtest.add("2");
        listtest.add("2");
        listtest.add("2");
        listtest.add("2");
        assertEquals(10, listtest.size());
    }

}