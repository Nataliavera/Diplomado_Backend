package condicionales_anidadas;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*
		 * Se ingresan tres notas de un alumno, si el promedio es mayor o igual a siete mostrar un mensaje "Promocionado".*/
		
		Scanner teclado = new Scanner(System.in);
		float suma = 0, prom = 0; 
		for(int i = 0; i < 3; i++) {
			System.out.println("Ingrese la nota del alumno: ");
			float nota = teclado.nextFloat();
			suma += nota; 
			prom = suma / 3; 
		}
		
		if(prom >= 7) {
			System.out.println("Es promocionado");
		}else {
			System.out.println("No es promocionado");
		}
	}
}
