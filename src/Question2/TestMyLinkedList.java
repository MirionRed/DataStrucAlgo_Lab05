/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question2;

/**
 *
 * @author Red King
 */
public class TestMyLinkedList {
    public static void main(String[] args) {
        new TestMyLinkedList();
    }

    public TestMyLinkedList() {
        MyLinkedList list = new MyLinkedList();
        for(int i = 0; i < 50; i++){
            list.add(i ,i);
        }
        for(int i = 0; i < 50; i++){
            System.out.println(list.get(i));
        }
        
        list.set(20, 100);
        list.set(25, 100);
        list.set(30, 100);
        System.out.println(list.get(25));
    }
}
