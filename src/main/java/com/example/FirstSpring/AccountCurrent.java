package com.example.FirstSpring;

import java.time.LocalDate;

public class AccountCurrent extends Account{

    private String checkbook;

    public AccountCurrent(String number, LocalDate dateOpen, double resideu, String checkbook) {
        super(number, dateOpen, resideu);
        this.checkbook = checkbook;
    }

    public String getCheckbook() {
        return checkbook;
    }

    public void setCheckbook(String checkbook) {
        this.checkbook = checkbook;
    }

    @Override
    public boolean withdraw(double amount) {
        return false;
    }
}
