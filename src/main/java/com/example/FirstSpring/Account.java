package com.example.FirstSpring;

import java.time.LocalDate;

public abstract class Account implements ActionsAccount {

    //Atributos de la clase
    protected String number;
    protected LocalDate dateOpen;
    protected double resideu;
    public static final  double INTEREST_RATE = 0.06;

    public Account(String number, LocalDate dateOpen, double resideu) {
        this.number = number;
        this.dateOpen = dateOpen;
        this.resideu = resideu;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDate getDateOpen() {
        return dateOpen;
    }

    public void setDateOpen(LocalDate dateOpen) {
        this.dateOpen = dateOpen;
    }

    public double getResideu() {
        return resideu;
    }

    public void setResideu(double resideu) {
        this.resideu = resideu;
    }

    public double dopist(double amount) {
        this.resideu += amount;
        return this.resideu;
    }
}

