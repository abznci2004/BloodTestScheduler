/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

import java.util.PriorityQueue;

public class PatientQueue {
    private PriorityQueue<Patient> queue = new PriorityQueue<>();

    public void addPatient(Patient p) { queue.add(p); }
    public Patient getNextPatient() { return queue.poll(); }
    public boolean isEmpty() { return queue.isEmpty(); }
}
