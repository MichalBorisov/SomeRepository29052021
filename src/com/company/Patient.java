package com.company;

import java.time.LocalDate;

public class Patient {
    String name;
    LocalDate dateOfBirth;
    Sex sex;
    String address;
    int id;
    private static int nextPatientId = 1;

    public Patient(String name, LocalDate dateOfBirth, Sex sex, String address) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.address = address;
    }

    public void bookAVisitToTheDoctor() {

    }

    public void patientRegistration() {
        this.id = nextPatientId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }
}


