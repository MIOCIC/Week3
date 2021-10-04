package hr.dream.factory.learning.collections.Array;

import hr.dream.factory.learning.collections.BaseCollection;

import java.util.EmptyStackException;

public class Queue implements BaseCollection<String> {

    String[] backingArray;
    public Queue(int capacity) {
        this.backingArray = new String[capacity];
    }

    //public Queue() {
    //}

    public String[] getBackingArray() {
        return backingArray;
    }

    @Override
    public void add(String o) {
        enqueue(o);
    }

    private void enqueue(String o) {
        if (backingArray.length == this.size()) {
            throw new FullStackException("It's full dumbass");
        }

        else backingArray[this.size()] = o;
    }

    @Override
    public void remove(String o) {
        throw new UnsupportedOperationException("Cannot remove specific element from stack, use dequeue() instead");
    }

    public String dequeue() {
        int len = this.size();
        if (len == 0)
            throw new EmptyStackException();
        String temp = backingArray[0];
        for (int i = 0; i < this.backingArray.length-1; i++) {
            this.backingArray[i] = this.backingArray[i+1];
        }
        this.backingArray[this.backingArray.length -1] = null;
        return temp;
    }

    @Override
    public int size() {
        int i = 0;
        for (String str : backingArray) {
            if(str != null) i++;
        }
        return i;
    }

    }

