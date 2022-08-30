package com.example.sprint2;

public class Empresa {
    private String companyName;
    private String companyAddress;
    private int companyPhone;
    private int companyNit;

    public Empresa(String companyName, String companyAddress, int companyPhone, int companyNit) {
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.companyPhone = companyPhone;
        this.companyNit = companyNit;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public int getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(int companyPhone) {
        this.companyPhone = companyPhone;
    }

    public int getCompanyNit() {
        return companyNit;
    }

    public void setCompanyNit(int companyNit) {
        this.companyNit = companyNit;
    }
}
