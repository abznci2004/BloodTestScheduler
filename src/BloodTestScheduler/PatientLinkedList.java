/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BloodTestScheduler;

public class PatientLinkedList implements LinkedListADT<Patient> {
    private class Node {
        Patient data;
        Node next, prev;
        public Node(Patient data) { this.data = data; }
    }

    private Node head, tail;
    private int size = 0;

    @Override
    public void add(Patient element) { 
        Node newNode = new Node(element);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    @Override
public void remove(int index) {  
    if (isEmpty()) {
        throw new UnsupportedOperationException("Cannot remove from an empty list.");
    }
    if (index < 0 || index >= size) return;
    
    Node temp = head;
    for (int i = 0; i < index; i++) temp = temp.next;
    
    if (temp.prev != null) temp.prev.next = temp.next;
    if (temp.next != null) temp.next.prev = temp.prev;
    
    if (index == 0) head = temp.next;
    if (index == size - 1) tail = temp.prev;
    
    size--;
}

    @Override
    public Patient get(int index) {  
        if (index < 0 || index >= size) return null;
        Node temp = head;
        for (int i = 0; i < index; i++) temp = temp.next;
        return temp.data;
    }

    @Override
    public boolean isEmpty() {  
        return size == 0;
    }

    @Override
    public int size() {  
        return size;
    }
}
