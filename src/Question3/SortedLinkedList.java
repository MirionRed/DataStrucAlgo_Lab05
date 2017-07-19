package Question3;

import java.util.Iterator;

public class SortedLinkedList<E> extends MyAbstractList<E> {

    private Node<E> head, tail;

    public SortedLinkedList() {
    }

    public SortedLinkedList(E[] objects) {
        super(objects);
    }

    public E getFirst() {
        if (size == 0) {
            return null;
        } else {
            return (E) head.element;
        }
    }

    public E getLast() {
        if (size == 0) {
            return null;
        } else {
            return (E) tail.element;
        }
    }

    public void addFirst(Comparable<E> e) {
        Node<E> newNode = new Node<E>(e); // Create a new node
        newNode.next = head; // link the new node with the head
        head = newNode; // head points to the new node
        size++; // Increase list size

        if (tail == null) // the new node is the only node in list
        {
            tail = head;
        }
    }

    public void addLast(Comparable<E> e) {
        Node<E> newNode = new Node<E>(e); // Create a new for element e

        if (tail == null) {
            head = tail = newNode; // The new node is the only node in list
        } else {
            tail.next = newNode; // Link the new with the last node
            tail = tail.next; // tail now points to the last node
        }

        size++; // Increase size
    }

    public E removeFirst() {
        if (size == 0) {
            return null;
        } else {
            Node<E> temp = head;
            head = head.next;
            size--;
            if (head == null) {
                tail = null;
            }
            return (E) temp.element;
        }
    }

    public E removeLast() {
        if (size == 0) {
            return null;
        } else if (size == 1) {
            Node<E> temp = head;
            head = tail = null;
            size = 0;
            return (E) temp.element;
        } else {
            Node<E> current = head;

            for (int i = 0; i < size - 2; i++) {
                current = current.next;
            }

            Node<E> temp = tail;
            tail = current;
            tail.next = null;
            size--;
            return (E) temp.element;
        }
    }

    @Override
    public E remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        } else if (index == 0) {
            return removeFirst();
        } else if (index == size - 1) {
            return removeLast();
        } else {
            Node<E> previous = head;

            for (int i = 1; i < index; i++) {
                previous = previous.next;
            }

            Node<E> current = previous.next;
            previous.next = current.next;
            size--;
            return (E) current.element;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");

        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            result.append(current.element.toString());
            current = current.next;
            if (current != null) {
                result.append(", "); // Separate two elements with a comma
            } else {
                result.append("]"); // Insert the closing ] in the string
            }
        }

        return result.toString();
    }

    @Override
    public void clear() {
        size = 0;
        head = tail = null;
    }

    public void add(E e) {
        Node<E> current = new Node<E>((Comparable<E>) e);
        Node<E> previous = head;
        if (size == 0) {
            head = tail = current;
        } else if (size == 1) {
            if (current.element.compareTo((E) previous.element) > 0) {
                previous.next = current;
                tail = current;
            } else {
                tail = previous;
                head = current;
                current.next = previous;
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (previous.next == null) {
                    previous.next = current;
                    tail = current;
                } else if (current.element.compareTo((E) previous.next.element) < 0) {
                    current.next = previous.next;
                    previous.next = current;
                    i = size;
                } else {
                    previous = previous.next;
                }
            }
        }
        size++;
    }

    @Override
    public boolean remove(E e) {
        Node<E> previous = head;
        for (int i = 0; i < size; i++) {
            if (previous.next == null) {
                return false;
            } else if (previous.next.element.equals(e)) {
                System.out.println(e);
                Node<E> temp = previous.next;
                previous.next = temp.next;
                size--;
                return true;
            } else {
                previous = previous.next;
            }
        }
        return false;
    }

    @Override
    public boolean contains(E e) {
        Node<E> current = head;
        for(int i = 0; i < size; i++){
            if(current.element.equals(e)){
                return true;
            }else{
                current = current.next;
            }
        }
        return false;
    }

    @Override
    public E get(int index) {
        Node<E> previous = head;
        if (index < 0 || index >= size) {
            return null;
        } else {
            for (int i = 0; i < index; i++) {
                previous = previous.next;
            }
            return (E) previous.element;
        }
    }

    @Override
    public int indexOf(E e) {
        Node<E> current = head;
        for(int i = 0; i<size; i++){
            if(current.element.equals(e))
                return i;
            else
                current = current.next;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(E e) {
        Node<E> current = head;
        int pos = -1;
        for(int i = 0; i < size; i++){
            if(current.element.equals(e)){
                pos = i;
                current = current.next;
            }
            else{
                current = current.next;
            }
        }
        return pos;
    }

    @Override
    public java.util.Iterator<E> iterator() {
        return new LinkedListIterator();
    }

    @Override
    public void add(int index, E e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object set(int index, E e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private class LinkedListIterator
            implements java.util.Iterator<E> {

        private Node<E> current = head; // Current index 

        @Override
        public boolean hasNext() {
            return (current != null);
        }

        @Override
        public E next() {
            E e = (E) current.element;
            current = current.next;
            return e;
        }

        @Override
        public void remove() {
            System.out.println("Implementation left as an exercise");
        }
    }

    private static class Node<E> {

        Comparable<E> element;
        Node<E> next;

        public Node(Comparable<E> element) {
            this.element = element;
        }
    }
}
