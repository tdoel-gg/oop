package test;

import Colletions.LinkedList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class test {

    private LinkedList<Integer> IntegerList() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(15);
        list.add(23);
        list.add(9);
        return list;
    }

    private LinkedList<String> StringList() {
        LinkedList<String> list = new LinkedList<>();
        list.add("привет");
        list.add("пока");
        list.add(")");
        return list;
    }

    @Test
    @DisplayName("add Integer")
    void addIntegerTest() {
        LinkedList<Integer> list = IntegerList();
        assertEquals(15, list.getHead().getValue());
        assertEquals(9, list.getTail().getValue());
        assertEquals(3, list.size());
    }

    @Test
    @DisplayName("delete Integer")
    void deleteIntegerTest() {
        LinkedList<Integer> list = IntegerList();
        list.delete();
        assertEquals(2, list.size());
        assertEquals(23, list.getTail().getValue());
    }

    @Test
    @DisplayName("delete value Integer")
    void deleteValueIntegerTest() {
        LinkedList<Integer> list = IntegerList();
        list.delete(23);

        assertEquals(2, list.size());
        assertThrows(NoSuchElementException.class,
                () -> list.delete(23));
    }

    @Test
    @DisplayName("find by value Integer")
    void findByValueIntegerTest() {
        LinkedList<Integer> list = IntegerList();
        assertEquals(23, list.findByValue(23).getValue());

        assertThrows(NoSuchElementException.class,
                () -> list.findByValue(4));
    }

    @Test
    @DisplayName("add String")
    void addStringTest() {
        LinkedList<String> list = StringList();
        assertEquals("привет", list.getHead().getValue());
        assertEquals(")", list.getTail().getValue());
        assertEquals(3, list.size());
    }

    @Test
    @DisplayName("delete String")
    void deleteStringTest() {
        LinkedList<String> list = StringList();
        list.delete();

        assertEquals(2, list.size());
        assertEquals("пока", list.getTail().getValue());
    }

    @Test
    @DisplayName("delete value String")
    void deleteValueStringTest() {
        LinkedList<String> list = StringList();
        list.delete("пока");

        assertEquals(2, list.size());
        assertThrows(NoSuchElementException.class,
                () -> list.delete("пока"));
    }

    @Test
    @DisplayName("find by value String")
    void findByValueStringTest() {
        LinkedList<String> list = StringList();
        assertEquals("пока", list.findByValue("пока").getValue());

        assertThrows(NoSuchElementException.class,
                () -> list.findByValue("))"));
    }
}