package com.example.sprint2;

public class MovimientoDinero {
    private float amount;
    private String concept;

    public MovimientoDinero(float amount, String concept) {
        this.amount = amount;
        this.concept = concept;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }
}
