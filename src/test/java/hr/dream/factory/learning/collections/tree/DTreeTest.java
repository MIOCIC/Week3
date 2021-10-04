package hr.dream.factory.learning.collections.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class DTreeTest {

    @Test
    public void add() {
        DTree lista = new DTree();
        lista.add(5);
        lista.add(6);
        lista.add(7);
        System.out.println(lista.print());
        lista.add(8);
        lista.add(8);
        System.out.println(lista.print());

    }

    @Test
    public void add_recursive() {
    }

    @Test
    public void size() {
        DTree lista = new DTree();
        lista.add(5);
        lista.add(6);
        lista.add(7);
        System.out.println(lista.size());
    }

    @Test
    public void remove() {
        DTree lista = new DTree();
        lista.add(5);
        lista.add(6);
        lista.add(11);
        lista.add(12);
        System.out.println(lista.print());
        lista.remove(11);
        System.out.println(lista.print());

    }
}