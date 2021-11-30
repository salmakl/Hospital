package com.hospital.app;

import com.hospital.enumerations.InsuranceType;
import com.hospital.models.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List <Doctor> doctors = new ArrayList<>();
        List <Patient> patients = new ArrayList<>();
        List <Room> rooms = new ArrayList<>();

        TimeSlot docTime = new TimeSlot(8,9);



        Doctor doctor1=new Doctor("Dr.Salma","KALKHI","1234","Safi","f123",docTime,120000);
        Doctor doctor2=new Doctor("Dr.Ohay","saritach","1234","Safi","f123",docTime,120000);
        doctors.add(doctor1);
        doctors.add(doctor2);
        Date entryDate = new Date(30,10,2019);

        Patient patient1=new Patient("Ahmed","Mohamed","1234","Safi",entryDate,"1234", InsuranceType.CNOPS);
        Patient patient2=new Patient("Nacer","Mohamed","1234","Safi",entryDate,"1234", InsuranceType.CNSS);
        Patient patient3=new Patient("Rami","Mohamed","1234","Safi",entryDate,"1234", InsuranceType.RAMED);

        patients.add(patient1);
        patients.add(patient2);
        patients.add(patient3);

        Room room1=new Room(1,1);
        Room room2=new Room(2,1);
        Room room3=new Room(3,1);

        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        Hospital hospital=new Hospital("Salma","Safi",doctors,rooms);



    }
}
