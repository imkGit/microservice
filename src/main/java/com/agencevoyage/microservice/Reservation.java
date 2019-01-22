/**
 * 
 */
package com.agencevoyage.microservice;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;


/**
 * @author FMI
 *
 */
@Getter
@Setter
public class Reservation {
	
	private LocalDate dateDebut;
	private LocalDate dateFin;
	private Vol vol;
	private Hotel hotel;

	
	

}
