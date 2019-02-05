package com.agencevoyage.microservice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.agencevoyage.microservice.service.ReservationService;
import com.agencevoyage.microservice.service.impl.ReservationServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MicroserviceApplicationTests {
	
	
	@Autowired
	ReservationServiceImpl reservationServiceImpl;

	@Test
	public void contextLoads() {
	}
	@Test
	public <T> void testLambda() {
		
		// exemple de function
		Function<Reservation, Boolean> isHotel = reservation  -> {
			
			if (reservation instanceof Hotel) {
			
			return true;
			
			} else
			return false;
			};
			System.out.println(isHotel);
			
			// exemple interface fonctineelle avec anonyme ou lambda
			ReservationService<T> anonymesRes = new ReservationService<T>() {

				@Override
				public void reserver(T t) {
					 System.out.println("Mon traitement"); 
					
				}
			};
			// la meme avec lambda
			ReservationService<Hotel> ii = ((hotel)-> { System.out.println("Mon traitement de reservation"+hotel); } );
			ii.reserver(new Hotel());
			
			reservationServiceImpl.reserver(new Hotel());
			
			// Exemple appel methode par default dans une interface: utilite : deux classe veulent utiliser une meme implementation 
			//(avant on utilise les classes abstraite ou factoriser le code en utilisant des classe utilitaresdonc statique )
			reservationServiceImpl.reserver();
			
			// exemple de methode statique dans une interface	
			ReservationService.afficherRes("Reservation du test methode statique");
			
			// methode refrences :
			// reference a une methode statique :
			
			boolean istheSameHotel = istheSameHotel(new Hotel(),x-> ReservationService.isHotel(x));
			
		
	}
	
	public boolean istheSameHotel(Hotel h,  Predicate<Hotel> p) {
		return p.test(h);
	}

	private Integer calculerReservationHotel(final List<Hotel> list) {
		//list.forEach(System.out::println);
		List result = new ArrayList<Hotel>();
		
		
		
		return list.size();
		
	}
	
	private static boolean isHotel(Reservation r) {
		if (r instanceof Hotel)
		return true;
		return false;
	}
}

