/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BloodTestScheduler;

public interface LinkedListADT<T> {
    void add(T element);
    void remove(int index);
    T get(int index);
    boolean isEmpty();
    int size();
}