package com.generation.f20220525;

import java.util.Scanner;

public class VentaTickets {

	public static void main(String[] args) {
		
        Scanner entrada = new Scanner(System.in);

		float descuento1, descuento2, descuentoCantidad, totalPago, descuentoFinal;
		int edadUsuario, edadDescuento1, edadDescuento2;
		int ticketNormal = 3500;
		edadDescuento1 = 15;
		edadDescuento2 = 60;
		descuentoFinal = 0f;
		// int cantidadTicket = 2;
		
		System.out.println("Por favor, ingrese su edad para calcular el precio final");
		edadUsuario = Integer.parseInt(entrada.nextLine());
//<= a 15 a?os
		descuento1 = (float) (ticketNormal - (ticketNormal * 0.6));
//Mayores de 60 a?os
		descuento2 = (float) (ticketNormal - (ticketNormal * 0.55));
//seg?n el total de tiket aplicando descuentos anteriores
//descuentoPorCantidad = totalPago ? (totalPago*0.3);
		if (edadUsuario > edadDescuento1 && edadUsuario <= edadDescuento2) {
			descuentoFinal = (float) ticketNormal;
		} else {
			if (edadUsuario <= edadDescuento1) {
				descuentoFinal = descuento1;
			} else {
				if (edadUsuario > edadDescuento2) {
					descuentoFinal = descuento2;
				}
			}
		}
		System.out.println("Su precio final de acuerdo a su edad es: $" + descuentoFinal + " CLP");
  		
		/*float descuento1, descuento2, descuentoCantidad, totalPago, descuentoFinal;
	    int edadUsuario, edadDescuento1, edadDescuento2;
	    int ticketNormal = 3500;
	    edadDescuento1 = 15;
	    edadDescuento2 = 60;
	    descuentoFinal = 0f;
	    int cantidadTicket = 2; 
	    float descuentoFinal2= 0.3f;
	    Scanner entrada = new Scanner(System.in);
	    																	//Scanner sc = new Scanner(System.in);
	    System.out.println("Por favor, ingrese su edad para calcular el precio final");
	    edadUsuario = entrada.nextInt();
	    
	    
	    
		System.out.println("Ingrese la cantidad de boletos a comprar");
  		cantidadTicket = Integer.parseInt(entrada.nextLine());
  		if(cantidadTicket>=2) {
  			totalPago= ((cantidadTicket*cantidadTicket)*descuentoFinal2);
  		}
  		else {
  			totalPago = ticketNormal;
  		}
		 */
		entrada.close();
		
	}
	
	
}
	    
