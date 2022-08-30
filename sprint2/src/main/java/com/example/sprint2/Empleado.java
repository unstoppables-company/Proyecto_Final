package com.example.sprint2;

public class Empleado {
    private String employeeName;
    private String employeeMail;
    private Empresa employeeCompany;
    private String employeeRole;

    public Empleado(String employeeName, String employeeMail, Empresa employeeCompany, String employeeRole) {
        this.employeeName = employeeName;
        this.employeeMail = employeeMail;
        this.employeeCompany = employeeCompany;
        this.employeeRole = employeeRole;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeMail() {
        return employeeMail;
    }

    public void setEmployeeMail(String employeeMail) {
        this.employeeMail = employeeMail;
    }

    public Empresa getEmployeeCompany() {
        return employeeCompany;
    }

    public void setEmployeeCompany(Empresa employeeCompany) {
        this.employeeCompany = employeeCompany;
    }

    public String getEmployeeRole() {
        return employeeRole;
    }

    public void setEmployeeRole(String employeeRole) {
        this.employeeRole = employeeRole;
    }
}
