package com.agencevoyage.microservice.service.impl;

import org.springframework.stereotype.Service;

import com.agencevoyage.microservice.Reservation;
import com.agencevoyage.microservice.service.ReservationService;

@Service
public class ReservationOmraServiceImpl implements ReservationService<Reservation> {

	@Override
	public void reserver(Reservation t) {
		// TODO Auto-generated method stub
		
	}
	// re implement de la methode default
	@Override
	public void reserver() {
		// appel de reserver par default
		ReservationService.super.reserver();
		System.out.println("OMRA");
	}
	


}
