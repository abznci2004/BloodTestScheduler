/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BloodTestScheduler;

import java.util.Stack;

public class NoShowStack implements StackADT<String> {
    private Stack<String> stack = new Stack<>();

    @Override
    public void push(String name) {
        if (stack.size() >= 5) {
            stack.remove(0); // Keep only the last 5 no-shows
        }
        stack.push(name);
    }

    @Override
    public String pop() {
        return stack.isEmpty() ? "No No-Shows" : stack.pop();
    }

    @Override
    public String peek() {
        return stack.isEmpty() ? "No No-Shows" : stack.peek();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public int size() {
        return stack.size();
    }
}