package com.company;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Queue;

public class TodayVisits {
    Queue<Visit> patientsInTheQueue = new LinkedList<>();

    public void waitingRoom(Patient patient) {
        patientsInTheQueue.add(new Visit(LocalDate.of(2021, 5, 30), "headache", TypeOfRequest.DISEASE,patient));
    }
}
