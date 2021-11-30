package com.hospital.models;

import java.util.Optional;

public class Operation {

	// Une opération sera dans un hôpital, dans une salle spécifique et gérée par un médecin X qui fait partie de l'hôpital :)
	
	// Il faut vérifier l'assurance du patient avant de passer l'opération
	
	// Ajouter une classe infirmière pour aider le médecin dans son travail
	
	// l'assurance rembourse un pourcentage de 70% si c'est CNSS et 80% pour RAMED et 100% pour CNOPS 
	
	// chaque opération a un prix, le patient doit payer le montant et après l'hopital va lui remboursser (le cas du CNSS et CNOPS) , si RAMED le patient va juste 
	// payer la différence dès le début (20%)
	
	// Proposition : Ajouter un attribut portefeuille à la classe Patient pour gérer le solde du patient, et du coup il faut avoir aussi une classe transaction qui traçe les 
	// actions de payments avec la date...
	
	// Essayer de structurer votre travail avec la création des interfaces qui vous permettez d'implémenter les méthodes nécessaires.
	
	// Après le payement d'une opération et si c'est passé avec succès le programme est terminé, sinon il faut renvoyer le montant vers la portefeuille patient
	// et dans ce cas son dossier est en stand by pour le discuter au tribunal. (vous devez gérer les status de chaque opération)

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