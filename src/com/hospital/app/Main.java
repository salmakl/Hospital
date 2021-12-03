package com.hospital.app;

import com.hospital.Impl.OperationImpl;
import com.hospital.enumerations.InsuranceType;
import com.hospital.models.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Hospital h=new Hospital();
        h.setCity("Safi");

        System.out.println(h.toString());
        List <Doctor> doctors = new ArrayList<>();
        List <Patient> patients = new ArrayList<>();
        List <Room> rooms = new ArrayList<>();
        List <Nurse> nurses = new ArrayList<>();

        TimeSlot docTime = new TimeSlot(8,9);



        Doctor doctor1=new Doctor("Dr.Salma","KALKHI","1234","Safi","f123",docTime,120000);
        Doctor doctor2=new Doctor("Dr.Ohay","saritach","1234","Safi","f123",docTime,120000);
        doctors.add(doctor1);
        doctors.add(doctor2);

        Nurse nurse1=new Nurse("Sali","aaa","1234","Safi","f123",docTime,120000);
        Nurse nurse2=new Nurse("Salim","aaa","1234","Safi","f124",docTime,120000);
        Nurse nurse3=new Nurse("Sal","aaa","1234","Safi","f125",docTime,120000);


        nurses.add(nurse1);
        nurses.add(nurse2);
        nurses.add(nurse3);
        Date entryDate = new Date(30,10,2019);
        InsuranceType insuranceType = InsuranceType.CNOPS;
        InsuranceType insuranceType1 = InsuranceType.CNSS;
        InsuranceType insuranceType2 = InsuranceType.RAMED;


        Patient patient1=new Patient("Ahmed","Mohamed","1234","Safi",entryDate,"1234", insuranceType,120000);
        Patient patient2=new Patient("Nacer","Mohamed","1234","Safi",entryDate,"1234", insuranceType1,1234);
        Patient patient3=new Patient("Rami","Mohamed","1234","Safi",entryDate,"1234", InsuranceType.RAMED,12346);

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





        List<Operation> operations=new ArrayList<>();
        OperationImpl operation=new OperationImpl();
        operation.addOperation(operations,hospital,doctor1,nurses,patient1,room1);
       // operation.addOperation(operations,hospital,doctor1,nurses,patient2,room2);

        //operation.addOperation(operations,hospital,doctor2,nurses,patient3,room3);



        //operation.getOperationByRef(operations,1);









    }
}
