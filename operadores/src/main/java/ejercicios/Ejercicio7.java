package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		/*
		 *Leer un número y escribir el valor absoluto del mismo */
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese un numero: ");
		Double n = teclado.nextDouble();
		
		Double va = Math.abs(n);
		System.out.println("el valor absoluto es: "+va);
		
	}

}
