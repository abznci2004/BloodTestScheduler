/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BloodTestScheduler;

public class Patient implements Comparable<Patient> {
    
    
    private String name;
    private int age;
    private String priority;  // Urgent, Medium, Low
    private GPInfo gpDetails;
    private boolean fromHospitalWard;  

    public Patient(String name, int age, String priority, GPInfo gpDetails, boolean fromHospitalWard) {
        this.name = name;
        this.age = age;
        this.priority = priority;
        this.gpDetails = gpDetails;
        this.fromHospitalWard = fromHospitalWard;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getPriority() { return priority; }
    public GPInfo getGpDetails() { return gpDetails; }
    public boolean isFromHospitalWard() { return fromHospitalWard; }  // ✅ New Getter

    @Override
    public int compareTo(Patient other) {
        //  Patients from  hospital ward get priority
        if (this.fromHospitalWard && !other.fromHospitalWard) return -1;
        if (!this.fromHospitalWard && other.fromHospitalWard) return 1;

        //  Compares priority (Urgent > Medium > Low)
        if (this.priority.equals("Urgent") && !other.priority.equals("Urgent")) return -1;
        if (this.priority.equals("Medium") && other.priority.equals("Low")) return -1;
        if (this.priority.equals(other.priority)) {
            //  If same priority, older patients go first
            return Integer.compare(other.age, this.age);
        }
        return 1;
    }

    @Override
    public String toString() {
        return name + " (Priority: " + priority + ", Age: " + age + ", Ward: " + (fromHospitalWard ? "Yes" : "No") + ", GP: " + gpDetails + ")";
    }
    
 
}
