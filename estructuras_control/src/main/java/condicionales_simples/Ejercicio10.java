package condicionales_simples;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		/*
		 * Un postulante a un empleo, realiza un test de capacitaci�n, se obtuvo la
	siguiente informaci�n: cantidad total de preguntas que se le realizaron y la cantidad
	de preguntas que contest� correctamente. Se pide confeccionar un programa que
	ingrese los dos datos por teclado e informe el nivel del mismo seg�n el porcentaje de
	respuestas correctas que ha obtenido, y sabiendo que:
	Nivel m�ximo: Porcentaje>=90%.
	Nivel medio: Porcentaje>=75% y <90%.
	Nivel regular: Porcentaje>=50% y <75%.
	Fuera de nivel: Porcentaje<50%.*/
		
		Scanner teclado = new Scanner(System.in);
		int canp, canb; 
		
		System.out.println("Ingrese el total de preguntas que se realizaron: ");
		canp = teclado.nextInt(); 
		
		System.out.println("Ingrese la cantidad de preguntas que contest� correctamente: ");
		canb = teclado.nextInt(); 
		
		double por = (canb * 100)/ canp;
		
		if(por >= 90) {
			System.out.println("Nivel m�ximp");
		}else if(por >= 75 && por <90) {
			System.out.println("Nivel medio");
		}else if(por >= 50 && por <75) {
			System.out.println("Nivel regular");
		}else {
			System.out.println("Fuera de nivel");
		}
	}
}
