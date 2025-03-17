/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BloodTestScheduler;

public class Patient implements Comparable<Patient> {
    private String name;
    private int age;
    private String priority;
    private GPInfo gpDetails;  // ✅ Change to GPInfo object

    public Patient(String name, int age, String priority, GPInfo gpDetails) {  // ✅ Fix constructor
        this.name = name;
        this.age = age;
        this.priority = priority;
        this.gpDetails = gpDetails;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getPriority() { return priority; }
    public GPInfo getGpDetails() { return gpDetails; }  // ✅ Update return type

    @Override
    public int compareTo(Patient other) {
        if (this.priority.equals("urgent") && !other.priority.equals("urgent")) return -1;
        if (this.priority.equals("medium") && other.priority.equals("low")) return -1;
        if (this.priority.equals(other.priority)) return Integer.compare(other.age, this.age);
        return 1;
    }

    @Override
    public String toString() {
        return name + " (Priority: " + priority + ", Age: " + age + ", GP: " + gpDetails + ")";
    }
}
