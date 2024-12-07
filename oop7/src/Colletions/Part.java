package Colletions;

import java.util.Objects;

public class Part<T> {
    private Part<T> previous;
    private Part<T> next;
    private T value;

    public Part(T value) {
        this.value = value;
    }

    public Part<T> getPrevious() {
        return previous;
    }

    public void setPrevious(Part<T> previous) {
        this.previous = previous;
    }

    public Part<T> getNext() {
        return next;
    }

    public void setNext(Part<T> next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Part<?> otherPart = (Part<?>) obj;
        return Objects.equals(value, otherPart.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

}
