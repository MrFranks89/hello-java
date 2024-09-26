package org.lesson.hello;

import java.util.Scanner;

public class SalutaMondo {
	public static void main(String[] args) {
		
		Scanner leggiDaTastiera = new Scanner(System.in);
		
		System.out.println("Inserisci due numeri per ottenere la somma");
		
		int numero1 = leggiDaTastiera.nextInt();
		int numero2 = leggiDaTastiera.nextInt();
		
		System.out.println("La somma dei numeri è: " + (numero1 + numero2));

	}
}
