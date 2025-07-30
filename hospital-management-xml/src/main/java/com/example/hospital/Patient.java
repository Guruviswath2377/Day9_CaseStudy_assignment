package com.example.hospital;
public class Patient {
    private String name;
    private int id;
    public void registerPatient() {
        System.out.println("Patient registered: " + name + " (ID: " + id + ")");
    }
    public void getPatientDetails() {
        System.out.println("Patient Details - Name: " + name + ", ID: " + id);
    }
    public void setName(String name) { this.name = name; }
    public void setId(int id) { this.id = id; }
}