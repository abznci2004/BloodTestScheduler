/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

public class Patient implements Comparable<Patient> {
    private String name;
    private int age;
    private String priority;
    private String gpDetails;

    public Patient(String name, int age, String priority, String gpDetails) {
        this.name = name;
        this.age = age;
        this.priority = priority;
        this.gpDetails = gpDetails;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getPriority() { return priority; }
    public String getGpDetails() { return gpDetails; }

    @Override
    public int compareTo(Patient other) {
        if (this.priority.equals("urgent") && !other.priority.equals("urgent")) return -1;
        if (this.priority.equals("medium") && other.priority.equals("low")) return -1;
        return Integer.compare(other.age, this.age);
    }

    @Override
    public String toString() {
        return name + " (Priority: " + priority + ", Age: " + age + ", GP: " + gpDetails + ")";
    }
}
