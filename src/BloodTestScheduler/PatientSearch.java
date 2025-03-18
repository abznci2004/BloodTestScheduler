/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BloodTestScheduler;

/**
 * Uses recursion to search for a patient in the linked list.
 */
public class PatientSearch {

   
    public static Patient searchRecursive(PatientLinkedList list, String name, int index) {
        if (index >= list.size()) return null;  

       
        if (list.get(index).getName().trim().equalsIgnoreCase(name.trim())) { 
            return list.get(index);  
        }
        
        return searchRecursive(list, name, index + 1); 
    }
}