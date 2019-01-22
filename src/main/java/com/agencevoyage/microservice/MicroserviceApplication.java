package com.agencevoyage.microservice;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroserviceApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(MicroserviceApplication.class, args);
		
	}
	
	public void reserverVol() {
		Vol vol = new Vol();
		Reservation reservation= new Reservation();
		reservation.setVol(vol);
		reservation.setDateDebut(LocalDate.now());
		reservation.setDateDebut(LocalDate.now().plusDays(10));
		
	
	}
	
	public void reserverHotel() {
		Hotel hotel = new Hotel();
		Reservation reservation= new Reservation();
		reservation.setHotel(hotel);
		reservation.setDateDebut(LocalDate.now());
		reservation.setDateDebut(LocalDate.now().plusDays(10));
		
	
	}

}

