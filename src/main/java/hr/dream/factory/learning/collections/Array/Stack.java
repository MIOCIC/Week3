package hr.dream.factory.learning.collections.Array;

import hr.dream.factory.learning.collections.BaseCollection;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.stream.Collectors;

public class Stack implements BaseCollection<String> {

    String[] backingArray;

    public Stack(int capacity) {
        this.backingArray = new String[capacity];
    }

    @Override
    public void add(String o) {
        push(o);
    }

    public void push(String o) {
        if (backingArray.length == this.size()) {
            throw new FullStackException("It's full dumbass");
        }

        else backingArray[this.size()] = o;
    }

    @Override
    public void remove(String o) {
        backingArray = Arrays.stream(backingArray)
                .filter(element -> element != null && ! element.equals(o))
                .toArray(String[]::new);
        //throw new UnsupportedOperationException("Cannot remove specific element from stack, use pop() instead");
        /*for (int i = 0; i < this.size(); i++) {
            while (backingArray[i] != null && backingArray[i].equals(o)) {
                for (int j = i; j < this.size()-1; j++) {
                    backingArray[j] = backingArray[j+1];
                }
                backingArray[this.size()-1] = null;
            }

        }*/
    }

    public String pop() {
        int len = this.size();
        if (len == 0)
            throw new EmptyStackException();
        String temp = backingArray[len - 1];
        backingArray[len-1] = null;
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