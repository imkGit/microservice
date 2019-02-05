package com.agencevoyage.microservice.service;

import com.agencevoyage.microservice.Hotel;
import com.agencevoyage.microservice.Reservation;

@FunctionalInterface
public interface ReservationService<T> {

	public void reserver(T t);
	public default void reserver() {
		System.out.println("reservation par defaut");
	}
	
	public default Boolean isReservationNull(Reservation res) {
		return res== null 
				;
	}
	public static String afficherRes(String s) {
		return s.toString();
	}
	public static boolean isHotel(Reservation t) {
		if(t instanceof Hotel)
		return true;
		else return false;
	}
	
}
