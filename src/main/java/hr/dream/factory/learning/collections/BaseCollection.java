package hr.dream.factory.learning.collections;

public interface BaseCollection<T> {
    void add(T o);
    void remove(T o);
    int size();

    default boolean isEmpty() {
        return 0 == size();
    }

}
