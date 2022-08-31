package com.example.sprint2;

public class Empresa {
    private String companyName;
    private String companyAddress;
    private String companyPhone;
    private String companyNit;

    public Empresa(String companyName, String companyAddress, String companyPhone, String companyNit) {
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

    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
    }

    public String getCompanyNit() {
        return companyNit;
    }

    public void setCompanyNit(String companyNit) {
        this.companyNit = companyNit;
    }
}
