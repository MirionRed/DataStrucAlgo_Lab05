/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public abstract class MyAbstractList<E> implements MyList<E>{
    protected int size = 0;
    
    protected MyAbstractList(){}
    
    protected MyAbstractList(E[]objects){
        for(int i = 0; i < objects.length; i++){
            add(objects[i]);
        }
    }
    
    @Override
    public void add(E e){
        add(size, e);
    }
    
    @Override
    public boolean isEmpty(){
        return size == 0;
    }
    
    @Override
    public int size(){
        return size;
    }
    
    @Override
    public boolean remove (E e){
        if(indexOf(e) >= 0){
            remove(indexOf(e));
            return true;
        }else
            return false;
    }
    
    @Override
    public boolean addAll(MyList<E> otherList) {
        int currentSize = size;
        for(int i = 0; i < otherList.size(); i++){
            add(otherList.get(i));
        }
        if(currentSize != size)
            return true;
        else 
            return false;
    }

    @Override
    public boolean removeAll(MyList<E> otherList) {
        int currentSize = size;
        for(int i = 0; i < otherList.size(); i++){
            remove(otherList.get(i));
        }
        if(currentSize != size)
            return true;
        else 
            return false;
    }

    @Override
    public boolean retainAll(MyList<E> otherList) {
        int currentSize = size;
        for(int i = 0; i < size(); i++){
            if(!otherList.contains(get(i))){
                remove(i);
            }
        }
        if(currentSize != size)
            return true;
        else 
            return false;
    }
    
}
