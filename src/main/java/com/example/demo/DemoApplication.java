package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

//@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		//SpringApplication.run(DemoApplication.class, args);

		Task task1 = new Task("Tarea 1: Aprender Java", false, LocalDate.of(2022,12,31));

		System.out.println(task1.getDescription());

		task1.setDescription("Tarea 1: Aprender Java y Desarrollo Web");

		System.out.println(task1.getDescription());
	}

}
