package condicionales_simples;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		/*
		 * Se cargan por teclado tres números distintos. Mostrar por pantalla el mayor de ellos.*/
		
		Scanner teclado = new Scanner(System.in);
		int n[] = new int[3];
		int mayor = 0; 
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Ingrese un numero: ");
			n[i] = teclado.nextInt();
			
			if(n[0] > n[i]) {
				mayor = n[0];
			}else {
				mayor = n[i];
			}
		}
		
		System.out.println("El numero mayor es: "+mayor);
		
	}
}
