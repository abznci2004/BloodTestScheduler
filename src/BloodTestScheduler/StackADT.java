/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BloodTestScheduler;

public interface StackADT<T> {
    void push(T element);
    T pop();
    T peek();
    boolean isEmpty();
    int size();
}