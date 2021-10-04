package hr.dream.factory.learning.collections.list;

public class Node {
    String value;
    Node next;

    public Node(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        if (next == null) { return value + "\n";}
        return value + "\n" + next.toString();
    }
}
