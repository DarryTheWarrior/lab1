package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    LinkedList list1=new LinkedList();
    @BeforeEach
    public void prepareData(){
        list1.add(2);
        list1.add(9);
        list1.add(1);
        list1.add(4);
    }
    @Test
    void add() {
        list1.add(10);
        Element getel= list1.get(4);
        assertEquals(10,getel.getvalue());
    }


    @Test
    void get() {
        Element getel =list1.get(1);
        assertEquals(9,getel.getvalue());
    }
    @Test
    void get2() {
        Element getel =list1.get(6);
        assertEquals(null, getel);
    }

    @Test
    void remove() {
        Element elrem = list1.remove(2);
        Element getel = list1.get(2);
        assertEquals(4,getel.getvalue());
        assertEquals(1,elrem.getvalue());
    }
    @Test
    void remove1() {
        Element getel = list1.remove(6);
        assertEquals(null,getel);
    }
}