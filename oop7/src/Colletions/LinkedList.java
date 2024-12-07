package Colletions;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<T> implements Iterable<Part<T>> {

    private Part<T> head;
    private Part<T> tail;
    private int size;

    public void add(T value) {
        Part<T> part = new Part<>(value);
        part.setNext(null);

        if (head == null) {
            part.setPrevious(null);
            head = part;
            tail = part;
        } else {
            tail.setNext(part);
            part.setPrevious(tail);
            tail = part;
        }
        size++;
    }

    public Part<T> delete() {
        if (tail == null) {
            return null;
        }

        Part<T> deletedPart = tail;
        if (tail.getPrevious() != null) {
            tail = tail.getPrevious();
            tail.setNext(null);
        } else {
            head = null;
            tail = null;
        }
        size--;
        return deletedPart;
    }

    public Part<T> delete(T value) {
        if (head == null) {
            return null;
        }

        Part<T> cur = head;

        while (cur != null) {
            if (cur.getValue().equals(value)) {
                if (cur.getPrevious() != null) {
                    cur.getPrevious().setNext(cur.getNext());
                } else {
                    head = cur.getNext();
                }

                if (cur.getNext() != null) {
                    cur.getNext().setPrevious(cur.getPrevious());
                } else {
                    tail = cur.getPrevious();
                }

                size--;
                return cur;
            }
            cur = cur.getNext();
        }

        throw new NoSuchElementException("Нет элемента");
    }

    public Part<T> findByValue(T value) {
        for (Part<T> elem : this) {
            if (elem.getValue().equals(value)) {
                return elem;
            }
        }
        throw new NoSuchElementException("Нет элемента");
    }

    public int size() {
        return size;
    }

    public Part<T> getHead() {
        return head;
    }

    public Part<T> getTail() {
        return tail;
    }


    @Override
    public Iterator<Part<T>> iterator() {
        return new Iterator<Part<T>>() {
            private Part<T> curr = head;

            @Override
            public boolean hasNext() {
                return curr != null;
            }

            @Override
            public Part<T> next() {
                if (!hasNext()) {
                    throw new NoSuchElementException("Нет следующего элемента");
                }
                Part<T> temp = curr;
                curr = curr.getNext();
                return temp;
            }
        };
    }
}