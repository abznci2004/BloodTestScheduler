/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BloodTestScheduler;

public interface PriorityQueueADT<T> {
    void enqueue(T element);
    T dequeue();
    boolean isEmpty();
    int size();
}
