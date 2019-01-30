package com.agencevoyage.microservice.service.impl;

import org.springframework.stereotype.Service;

import com.agencevoyage.microservice.Reservation;
import com.agencevoyage.microservice.service.ReservationService;

@Service
public class ReservationServiceImpl implements ReservationService<Reservation>         {

	@Override
	public void reserver(Reservation t) {
		//IK
		//je propose une implémentation de la methode 
		//reserver dont fares n'est pas d'accord
		
		//IK si reservation null alors j'imprime un message
		//et je sors
		if(null==t) {
			System.out.println("aucune reservation en entrée");
			return;
		}
		
		//IK
		//jappel hibernate pour sauvegarder la reservation
	}


}
