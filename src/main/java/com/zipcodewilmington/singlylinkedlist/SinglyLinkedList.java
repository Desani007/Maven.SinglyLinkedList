package com.zipcodewilmington.singlylinkedlist;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> {
    Node<T> head = null;
    Node<T> last = null;
    int index = 0;

    int nodeCount = 0;

    SinglyLinkedList() {

    }

    public int size() {
        Node<T> tempNode = head;

        while (tempNode.next != null) {

            tempNode = tempNode.next;

            nodeCount++;
        }
        return nodeCount;
    }


    public void add(T value) {

        if (head == null) {
            Node<T> newNode = new Node<>(null, value);

            head = newNode;

            nodeCount++;
        } else {
            Node<T> tempNode = head;
            while (tempNode.next != null) {
                tempNode = tempNode.next;
                nodeCount++;
            }
            tempNode.next = new Node<T>(null, value);
        }}

    public Boolean contains (T value){

        int i = 0;

        Node currentNode = this.head;
        while (currentNode != null){
            if (currentNode.getValue().equals(value)){
                index = 1;
                break;
            }

            currentNode = currentNode.getNext();
            i++;
        }

        return index == 1;
    }

    public T getValue(int index){
        if (index > this.nodeCount){
            throw new IndexOutOfBoundsException();
        }

        Node currentNode = this.head;
        int i = 0;
        while (currentNode != null){
            if (i == index) return (T) currentNode.getValue();
            currentNode = currentNode.getNext();
            i++;
        }

        return null;
    }

    public Integer find (T value){

        if (contains(value)) return index;
        return -1;
    }





    public class Node<T>{

        Node<T> next;
        Node<T> prev;
        T value;
        int index;


        Node (Node<T> next, T value) {
            this.next=next;
            this.value= value;
        }


        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }
    }




}
