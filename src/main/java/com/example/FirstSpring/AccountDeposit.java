package com.example.FirstSpring;

import java.time.LocalDate;

public class AccountDeposit extends Account{

    private double minResidue;

    public AccountDeposit(String number, LocalDate dateOpen, double resideu, double minResidue) {
        super(number, dateOpen, resideu);
        this.minResidue = minResidue;
    }

    public double getMinResidue() {
        return minResidue;
    }

    public void setMinResidue(double minResidue) {
        this.minResidue = minResidue;
    }

    @Override
    public boolean withdraw(double amount) {
        return false;
    }
}
