/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

import java.util.Iterator;

/**
 *
 * @author BLANK
 */
public interface MyList<E> extends Iterable<E> {
    public void add(E e);
    public void add(int index, E e);
    public void clear();
    public boolean contains(E e);
    public E get (int index);
    public int indexOf(E e);
    public boolean isEmpty();
    public int lastIndexOf(E e);
    public boolean remove(E e);
    public E remove(int index);
    public Object set(int index, E e);
    public int size();
    public Iterator<E> iterator();
}
