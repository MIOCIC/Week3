package hr.dream.factory.learning.collections.list;

import hr.dream.factory.learning.collections.BaseCollection;
import hr.dream.factory.learning.collections.WrongElementException;
import hr.dream.factory.learning.equals.Person;

public class DList implements BaseCollection<String> {
    Node head;

    public DList() {
    }


    @Override
    public void add(String o) {
        Node n = new Node(o);

        Node current = head;

        if(current == null) {
            head = n;
            return;
        }

        while(current != null && current.next != null){
            current = current.next;
        }
        current.next = n;
    }

    @Override
    public void remove(String o) {
        Node n = new Node(o);
        Node current = head;
        Node previous = head;

        if (head == null) {return;}

        if (n == head) {
            head = current.next;
            return;
        }

        while (current.next != null) {
            current = current.next;

            if (current.equals(n)) {
                previous.next = current.next;
            }

            previous = current;
        }
    }

    public String print() {
        return head.toString();
    }

   /* @Override
    public void remove(Object o) {
        if (! (o instanceof Node)) {
            throw new WrongElementException("some meaningful words");
        }
        Node n = (Node) o;
        Node current = head;
        Node previous = head;

        if (head == null) {return;}

        if (n == head) {
            head = current.next;
            return;
        }

        while (current.next != null) {
            current = current.next;

            if (current.equals(n)) {
                previous.next = current.next;
            }

            previous = current;
        }
    }*/

    @Override
    public int size() {
        if(this.head == null) {return 0;}
        int counter = 1;
        Node current = head;
        while(current.next != null){
            counter++;
            current = current.next;
        }
        return counter;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

}
