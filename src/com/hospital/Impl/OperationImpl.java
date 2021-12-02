package com.hospital.Impl;


import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import com.hospital.enumerations.InsuranceType;
import com.hospital.interfaces.OperationInterface;
import com.hospital.models.*;



public class OperationImpl implements OperationInterface{
    private  static List<Operation> Operations;
    Scanner scanner = new Scanner(System.in);

    public OperationImpl() {

    }

    @Override
    public Optional<Operation> getOperationByRef(List<Operation> operations,int ref) {
        for (Operation op:operations) {
            if(op.getRef()==ref){
                return Optional.of(op);
            }
        }
        return null;
    }

    @Override
    public void addOperation(List<Operation> operations, Hospital hospital, Doctor doctor, List<Nurse> nurses, Patient patient, Room room) {
        System.out.println("Hospital : " + hospital.getName());

        System.out.println("Room number : " + room.getNumber() + "Stage" + room.getStage());

        System.out.println("Patient name : " + patient.getFirstname() + " " + patient.getLastname());

        System.out.println("Doctor name : " + doctor.getFirstname() + " " + doctor.getLastname());

        for(Nurse nurse : nurses) {
            System.out.println("Nurse name : " + nurse.getFirstname() + " " + nurse.getLastname());
        }
        System.out.println("Operation Date : ");
        String date = scanner.nextLine();

        System.out.println("Operation Price : ");
        int price = scanner.nextInt();

        if (price > patient.getWallet()) {
            System.out.println("You don't have enough money");
            System.out.println("1. Add Money");
            System.out.println("2. Check wallet");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 :System.out.println("amount : "); patient.addToWallet(scanner.nextDouble());break;
                case 2 :System.out.println(patient.getWallet());break;
                case 3 : System.exit(0);
            }

        }


        scanner.nextLine();

        double toPay = price;
        InsuranceType insType = null;

        insType = patient.getInsuranceType();

        switch (insType){
            case CNOPS: patient.addToWallet(price);break;
            case RAMED: patient.addToWallet(price*0.8);toPay = price * 0.2;break;
            case CNSS: patient.addToWallet(price*0.7);break;
        }

        Operation operation = new Operation(hospital, room, doctor, patient, nurses, date, price);
        operations.add(operation);

        System.out.println("Operation has been added successfully !");

        System.out.println("Choose from the menu !");

        System.out.println("1.Get Status");
        System.out.println("2.Change Status");
        System.out.println("3.Total price");
        System.out.println("4.Total to pay");
        System.out.println("0.Exit");


        int choice = scanner.nextInt();
        scanner.nextLine();

 do {
     switch (choice) {
         case 1:System.out.println(operation.getStatus());break;
         case 2:System.out.println("Enter the status : ");
             System.out.println("1.Done");
             System.out.println("2.Pending");
             System.out.println("3.Failed");
             System.out.println("0.Exit");
             int status = scanner.nextInt();
             if (status == 1) {
                 statusDone(operation);
             }else if (status == 2) {
                 statusPending(operation);
             }else if (status == 3) {
                 statusFailed(operation);
             }
             break;
         case 3:System.out.println(operation.getPrice());break;
         case 4:System.out.println(operation.getToPay());break;
         case  0:System.exit(0);break;

     }
     System.out.println("1.Get Status");
     System.out.println("2.Change Status");
     System.out.println("3.Total price");
     System.out.println("4.Total to pay");
     System.out.println("0.Exit");
     choice = scanner.nextInt();
     scanner.nextLine();
        }while (choice != 0);

    }
    public void menuOperation(){
        System.out.println("1- Add Operation");
        System.out.println("2- Show Operation");
        System.out.println("3- Back");
    }

    public void statusDone(Operation operation){
        operation.setStatus("Done");
    }
    public void statusPending(Operation operation){
        operation.setStatus("Pending");
    }
    public void statusFailed(Operation operation){
        operation.setStatus("Feiled");
    }



}
