package com.hospital.models;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public class Operation {

    // Une op�ration sera dans un h�pital, dans une salle sp�cifique et g�r�e par un m�decin X qui fait partie de l'h�pital :)

    // Il faut v�rifier l'assurance du patient avant de passer l'op�ration

    // Ajouter une classe infirmi�re pour aider le m�decin dans son travail

    // l'assurance rembourse un pourcentage de 70% si c'est CNSS et 80% pour RAMED et 100% pour CNOPS

    // chaque op�ration a un prix, le patient doit payer le montant et apr�s l'hopital va lui remboursser (le cas du CNSS et CNOPS) , si RAMED le patient va juste
    // payer la diff�rence d�s le d�but (20%)

    // Proposition : Ajouter un attribut portefeuille � la classe Patient pour g�rer le solde du patient, et du coup il faut avoir aussi une classe transaction qui tra�e les
    // actions de payments avec la date...

    // Essayer de structurer votre travail avec la cr�ation des interfaces qui vous permettez d'impl�menter les m�thodes n�cessaires.

    // Apr�s le payement d'une op�ration et si c'est pass� avec succ�s le programme est termin�, sinon il faut renvoyer le montant vers la portefeuille patient
    // et dans ce cas son dossier est en stand by pour le discuter au tribunal. (vous devez g�rer les status de chaque op�ration)

    private double ref=0;
    private Hospital hospital;
    private Room room;
    private Doctor doctor;
    private Patient patient;
    private List<Nurse> nurses;
    private String date;
    private double price;
    private String status;
    private double toPay;

    public Operation(){}

    public Operation(Hospital hospital, Room room, Doctor doctor, Patient patient, List<Nurse> nurses, String date, double price) {
        this.ref = ref++;
        this.hospital = hospital;
        this.room = room;
        this.doctor = doctor;
        this.patient = patient;
        this.nurses = nurses;
        this.date = date;
        this.price = price;
    }

    public double getRef() {
        return ref;
    }

    public void setRef(int ref) {
        this.ref = ref;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void setRef(double ref) {
        this.ref = ref;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public List<Nurse> getNurses() {
        return nurses;
    }

    public void setNurses(List<Nurse> nurses) {
        this.nurses = nurses;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getToPay() {
        return toPay;
    }

    public void setToPay(double toPay) {
        this.toPay = toPay;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "ref=" + ref +
                ", hospital=" + hospital +
                ", room=" + room +
                ", doctor=" + doctor +
                ", patient=" + patient +
                ", nurses=" + nurses +
                ", date='" + date + '\'' +
                ", price=" + price +
                ", status='" + status + '\'' +
                ", toPay=" + toPay +
                '}';
    }
}