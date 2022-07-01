package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		/*
		 *Calcular el nuevo salario de un obrero si tuvo un incremento del 25 % sobre el salario anterior */
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese el valor de su salario: ");
		Double salario = teclado.nextDouble();
		
		Double nuevoS = salario * 1.25; 
		
		System.out.println("El nuevo salario es: "+nuevoS);
	}

}
