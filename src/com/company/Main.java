package com.company;

import java.time.LocalDate;

public class Main {



    public static void main(String[] args) {

        Patient patient01 = new Patient("Josef Vocasek", LocalDate.of(1950, 12, 12), Sex.MALE, "Vokurkova 7, 602 00B Brno");
        Patient patient02 = new Patient("Helena Malirova", LocalDate.of(1960, 2, 2), Sex.FEMALE, "U Statdionu 8, 703 00 Ostrava");
        Patient patient03 = new Patient("Igor Fikus", LocalDate.of(1940, 1, 1), Sex.MALE, "Helenska 1, 101 00 Praha");
        Patient patient04 = new Patient("Inna Novakova", LocalDate.of(1970, 10, 10), Sex.FEMALE, "Rokycanska 7, 301 00B Plzen");
        Patient patient05 = new Patient("Martin Werner", LocalDate.of(1990, 3, 9), Sex.MALE, "Tesinska 6, 747 00B Opava");

        patient01.patientRegistration();

        TodayVisits todayVisits = new TodayVisits();
        todayVisits.waitingRoom(patient01);
        todayVisits.waitingRoom(patient02);
        todayVisits.waitingRoom(patient03);
        todayVisits.waitingRoom(patient04);
        todayVisits.waitingRoom(patient05);
    }


}
