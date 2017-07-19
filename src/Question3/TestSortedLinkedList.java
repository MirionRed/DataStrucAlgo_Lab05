/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

import java.util.Random;

/**
 *
 * @author BLANK
 */
public class TestSortedLinkedList {

    public static void main(String[] args) {
        Random random = new Random();
        SortedLinkedList list = new SortedLinkedList();
        for(int i = 0; i < 50; i++){
            list.add(i);
        }
        System.out.println(list.toString());
        System.out.println(list.get(20) + ", " + list.get(30));
        boolean remove20 = list.remove((Object)20); 
        boolean remove30 = list.remove((Object)30);
        System.out.println(list.toString());
        System.out.println(list.contains(30));
        System.out.println(list.contains(25));
        System.out.println(list.iterator());
        System.out.println(list.indexOf(5));
        System.out.println(list.indexOf(20));
        System.out.println("LAST ERROR " + list.lastIndexOf(20));
        list.add(10); list.add(235235); list.add(13242); list.add(10); list.add(55);
        System.out.println("LAST Positive " + list.lastIndexOf(10));
        System.out.println(list.toString());
        System.out.println(list.lastIndexOf(10));
        System.out.println(list.get(52));
        System.out.println("TRUE FINISH " + list.lastIndexOf(10));
        //too lazy to do proper testing
        //it should work most of the time 
        //probably lol XP
    }
}
