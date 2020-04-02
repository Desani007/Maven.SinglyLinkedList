package com.zipcodewilmington.singlylinkedlist;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void addTest(){
        SinglyLinkedList list = new SinglyLinkedList();
       list.add("Destiny");
       list.add("Kevin");

        assertTrue(list.head.next.value.equals("Kevin"));
        assertNull(list.head.next.next);
    }

    @Test
    public void removeTest(){
        SinglyLinkedList list = new SinglyLinkedList();
        list.add("Destiny");
        list.add("Kevin");

        assertTrue(list.head.next.value.equals("Destiny"));

    }
    @Test
    public void sizeTest(){
        SinglyLinkedList list = new SinglyLinkedList();
        list.add("Destiny");
        list.add("Kevin");
        list.size();
        assertEquals(2,list.size());
    }
    @Test
    public void getTest(){
        SinglyLinkedList list = new SinglyLinkedList();
        list.add("Destiny");
        list.add("Kevin");



    }
    @Test
    public void testGetItem(){
        SinglyLinkedList list = new SinglyLinkedList();

        list.add("First");
        list.add("Second");
        list.add("Third");

        String actual = (String) list.getValue(1);
        String expected = "Second";
        Assert.assertEquals(expected,actual);

    }


    @Test
    public void contains() {
        SinglyLinkedList list = new SinglyLinkedList();

        list.add("First");
        list.add("Second");
        list.add("Third");

        boolean actual = list.contains("Second");
        Assert.assertTrue(actual);

        list.add(3);
        list.add(6);

        actual = list.contains(3);
        Assert.assertTrue(actual);
    }

    @Test
    public void find() {

        SinglyLinkedList list = new SinglyLinkedList();

        list.add("First");
        list.add("Second");
        list.add("Third");

        Integer actual = list.find("Second");
        Integer expected = 1;
        Assert.assertEquals(expected,actual);
    }
}
