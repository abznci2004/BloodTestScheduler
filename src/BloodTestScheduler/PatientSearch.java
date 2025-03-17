/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BloodTestScheduler;

/**
 * Uses recursion to search for a patient in the linked list.
 */
public class PatientSearch {

    /**
     * Recursively searches for a patient by name.
     * @param list The patient linked list.
     * @param name The name to search for.
     * @param index The current index (start with 0).
     * @return The Patient if found, otherwise null.
     */
    public static Patient searchRecursive(PatientLinkedList list, String name, int index) {
        if (index >= list.size()) return null; // Base case: reached end of list
        if (list.get(index).getName().equalsIgnoreCase(name)) return list.get(index); // Found match
        return searchRecursive(list, name, index + 1); // Recursive call
    }
}