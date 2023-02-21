package exercicio5;

import java.time.LocalTime;
import java.util.Locale;

public class TestaIngresso {

	public static void main(String[] args) {

	        Locale.setDefault(Locale.US);
	        
	        Ingresso ingresso1 = new Ingresso("Juliana", "866.345.770-72","1",
	                LocalTime.of(9,00,0),110.00);

	        Ingresso ingresso2 = new Ingresso("Livia", "484.476.890-50","1",
	                LocalTime.of(9,00,0),50.00);
	  
	        ingresso1.visulizar();
	        ingresso2.visulizar();
	    }

	}
