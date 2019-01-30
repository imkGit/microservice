package com.agencevoyage.microservice.service.impl;

import org.springframework.stereotype.Service;

import com.agencevoyage.microservice.Reservation;
import com.agencevoyage.microservice.service.ReservationService;

@Service
public class ReservationServiceImpl implements ReservationService<Reservation>         {

	@Override
	public void reserver(Reservation t) {
		//Fares ==> je propose cette implementation de la methode reserver

		
		if(null==t) {
			t = new Reservation();
		}
		
		//Fares ==> j'appel hibernate pour sauvegarder la reservation dans la BD.
				
	}
		
		//IK
		//jappel hibernate pour sauvegarder la reservation
	}



