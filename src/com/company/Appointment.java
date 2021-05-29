package com.company;

import java.time.LocalDate;

public class Appointment {
    String name;
    LocalDate dateOfVisit;
    String troubleDescription;
    TypeOfRequest type;
    int counter = 0;

    public Appointment(LocalDate dateOfVisit, String troubleDescription, TypeOfRequest type, Patient patient) {
        this.name = patient.getName();
        this.dateOfVisit = LocalDate.now().plusDays(14);
        this.troubleDescription = troubleDescription;
        this.type = type;
        counter++;
    }

    public LocalDate getDateOfVisit() {
        return dateOfVisit;
    }

    public void setDateOfVisit(LocalDate dateOfVisit) {
        this.dateOfVisit = dateOfVisit;
    }

    public String getTroubleDescription() {
        return troubleDescription;
    }

    public void setTroubleDescription(String troubleDescription) {
        this.troubleDescription = troubleDescription;
    }

    public TypeOfRequest getType() {
        return type;
    }

    public void setType(TypeOfRequest type) {
        this.type = type;
    }
}
