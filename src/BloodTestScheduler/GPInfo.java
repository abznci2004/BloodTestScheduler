/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BloodTestScheduler;

/**
 * Represents General Practitioner (GP) information.
 */
public class GPInfo {
    private String gpName;
    private String hospital;
    private String contactNumber;

    // Constructor
    public GPInfo(String gpName, String hospital, String contactNumber) {
        this.gpName = gpName;
        this.hospital = hospital;
        this.contactNumber = contactNumber;
    }

    // Getters
    public String getGpName() { return gpName; }
    public String getHospital() { return hospital; }
    public String getContactNumber() { return contactNumber; }
     

    // Setters
    public void setGpName(String gpName) { this.gpName = gpName; }
    public void setHospital(String hospital) { this.hospital = hospital; }
    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }

    @Override
    public String toString() {
        return gpName + " (Hospital: " + hospital + ", Contact: " + contactNumber + ")";
    }
}