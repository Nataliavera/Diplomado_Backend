package condicionales_simples;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		/*
		 * Confeccionar un programa que pida por teclado tres notas de un alumno, calcule el promedio e imprima alguno de estos mensajes:
	Si el promedio es >=7 mostrar "Promocionado".
	Si el promedio es >=4 y <7 mostrar "Regular".
	Si el promedio es <4 mostrar "Reprobado".*/
		
		Scanner teclado = new Scanner(System.in);
		float nota, suma = 0, prom= 0;
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Ingrese la nota del alumno: ");
			nota = teclado.nextFloat();
			suma += nota; 
			prom = suma / 3;
		}
		
		if(prom >= 7) {
			System.out.println("Promocionado");
		}else if(prom >= 4 && prom < 7) {
			System.out.println("Regular");
		}else {
			System.out.println("Reprobado");
		}
	}
}
