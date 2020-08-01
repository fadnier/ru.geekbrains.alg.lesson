package lesson4;

public class LinkedQueue<T> {
    private MyLinkedList<T> queue = new MyLinkedList<>();

    public void insert(T item) {
        queue.insertFirst(item);
    }

    public T remove() {
        return queue.deleteLast();
    }

    public T peek() {
        return queue.getLast();
    }

    public int size() {
        return queue.size();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
