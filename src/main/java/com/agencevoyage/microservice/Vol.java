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
public class Vol extends Reservation{

	private String companie;
	private Integer numeroVol;
	private String depart;
	private String destination;

}

//Test Pour montrer l'utilité de fetch par fares
