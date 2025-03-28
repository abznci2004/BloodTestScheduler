/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BloodTestScheduler;

import java.util.PriorityQueue;

public class PatientQueue {
    private PriorityQueue<Patient> queue = new PriorityQueue<>();

    public void addPatient(Patient p) { queue.add(p); }
    
    public PriorityQueue<Patient> getQueue() {
    return queue;
}

    public Patient getNextPatient() { 
        if (queue.isEmpty()) {
            System.out.println("⚠ No patients in queue.");
            return null; 
        }
        return queue.poll();
    }

    public boolean isEmpty() { return queue.isEmpty(); }

    public int size() { return queue.size(); }  
}

