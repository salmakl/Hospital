package com.hospital.models;

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

    private int ref;
    private int room;
    private int doctor;
    private int patient;
    private double price;

    public Operation(int ref, int room, int doctor, int patient, double price) {
        this.ref = ref;

        this.room = room;
        this.doctor = doctor;
        this.patient = patient;
        this.price = price;
    }

 // Getters and Setters
    public int getRef() {
        return ref;
    }

    public void setRef(int ref) {
        this.ref = ref;
    }


    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public int getDoctor() {
        return doctor;
    }

    public void setDoctor(int doctor) {
        this.doctor = doctor;
    }

    public int getPatient() {
        return patient;
    }

    public void setPatient(int patient) {
        this.patient = patient;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}