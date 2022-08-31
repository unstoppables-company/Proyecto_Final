package com.example.sprint2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

//@SpringBootApplication
public class Sprint2Application {

	public static void main(String[] args) {

		//SpringApplication.run(Sprint2Application.class, args);

		Empresa empresa1 = new Empresa("Soluciones", "Cra 6 Nº 34-68 Bogota", "3168759865", "900765890");

		System.out.println(empresa1.getCompanyName() + ", " + empresa1.getCompanyAddress() + ", " + empresa1.getCompanyPhone() + ", " + empresa1.getCompanyNit());

		empresa1.setCompanyName("Soluciones AC");
		empresa1.setCompanyAddress("Cra 6 Nº 34-68 Bogota - Colombia");
		empresa1.setCompanyPhone("+57 3168759865");
		empresa1.setCompanyNit("900765890-1");

		System.out.println(empresa1.getCompanyName() + ", " + empresa1.getCompanyAddress() + ", " + empresa1.getCompanyPhone() + ", " + empresa1.getCompanyNit());

		Empleado empleado1 = new Empleado ("Luis", "luis@ejemplo.com", empresa1, "Administrador");

		System.out.println(empleado1.getEmployeeName() + ", " + empleado1.getEmployeeMail() + ", " + empleado1.getEmployeeCompany().getCompanyName() + ", " + empleado1.getEmployeeRole());

		empleado1.setEmployeeName("Luis Morales");
		empleado1.setEmployeeMail("luismorales@ejemplo.com");
		empleado1.setEmployeeCompany(empresa1);
		empleado1.setEmployeeRole("Operativo");

		System.out.println(empleado1.getEmployeeName() + ", " + empleado1.getEmployeeMail() + ", " + empleado1.getEmployeeCompany().getCompanyName() + ", " + empleado1.getEmployeeRole());

		MovimientoDinero movimientoDinero1 = new MovimientoDinero(123000, "Ingreso");

		System.out.println(movimientoDinero1.getAmount() + ", " + movimientoDinero1.getConcept());

		movimientoDinero1.setAmount(-65000);
		movimientoDinero1.setConcept("Egreso");

		System.out.println(movimientoDinero1.getAmount() + ", " + movimientoDinero1.getConcept());

	}

}
