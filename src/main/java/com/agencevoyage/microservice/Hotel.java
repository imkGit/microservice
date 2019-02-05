/**
 * 
 */
package com.agencevoyage.microservice;

import lombok.Getter;
import lombok.Setter;

/**
 * @author FMI
 *
 */
@Getter
@Setter
public class Hotel extends Reservation {
	
	String typeChambre;
	Integer nbAdulte;
	Integer nbNonAdule;
	String nomHotel;

}
