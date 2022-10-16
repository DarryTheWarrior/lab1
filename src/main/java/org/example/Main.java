package org.example;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        LinkedList aLinkedList = new LinkedList();
        aLinkedList.add(0);
        aLinkedList.add(1);
        aLinkedList.add(2);
        aLinkedList.add(3);
        aLinkedList.add(4);
        aLinkedList.printLinkedList();
        System.out.println();
        aLinkedList.remove(5);
        aLinkedList.printLinkedList();
        System.out.println();
        aLinkedList.remove(0);
        aLinkedList.printLinkedList();
        System.out.println();
        aLinkedList.remove(3);
        aLinkedList.printLinkedList();
        System.out.println();
        aLinkedList.remove(1);
        aLinkedList.printLinkedList();
        System.out.println();
    }

}